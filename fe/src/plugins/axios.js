import Vue from 'vue';
import axios from 'axios';

const baseURL = '/api';

// To use baseURL in <img>
Vue.mixin({
    computed: {
        baseURL: () => baseURL
    }
});

// Full config:  https://github.com/axios/axios#request-config
// axios.defaults.baseURL = process.env.baseURL || process.env.apiUrl || '';
// axios.defaults.headers.common['Authorization'] = AUTH_TOKEN;
// axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';

const config = {
    baseURL,
    // timeout: 60 * 1000, // Timeout
    withCredentials: true, // Check cross-site Access-Control
    headers: {
        'Content-Type': 'multipart/form-data',
        'Accept': 'application/json'
    }
};

const _axios = axios.create(config);

_axios.interceptors.request.use(request => {
    window.components.loading.start();
    return request;
}, error => {
    window.components.loading.error();
    return Promise.reject(error.status);
});

// Add a response interceptor
_axios.interceptors.response.use(response => {
    window.components.loading.finish();
    return response;
}, error => {
    window.components.loading.finish();
    if (error.response) {
        // TODO: need to add some code
        switch (error.response.status) {
        case 401:
        case 403:
            window.components.message.error('code 401/403: Unauthorized request, redirecting to index');
            return Promise.reject(error.response.status);
            // window.components.router.push('/');
        }
    }
    return error.response;
});

async function request(method, url, params, data) {
    let pStr = '';
    if (params !== undefined && params !== null) {
        pStr = params.join('/');
    }
    pStr += '/';
    const result = await _axios.request({
        url: url + pStr,
        method,
        data
    });
    return result;
}

async function get(url, params) {
    return await request('get', url, params, undefined);
}

async function post(url, params, data) {
    return await request('post', url, params, data);
}

async function put(url, params, data) {
    return await request('put', url, params, data);
}

async function patch(url, params, data) {
    return await request('patch', url, params, data);
}
async function f(url, params) {
    return await request('delete', url, params);
}

const _http = {
    get,
    post,
    put,
    patch,
    'delete': f
};

Plugin.install = function(Vue) {
    Vue.axios = _axios;
    window.axios = _axios;
    window.http = _http;
    Object.defineProperties(Vue.prototype, {
        $axios: {
            get() {
                return _axios;
            }
        },
        $http: {
            get() {
                return _http;
            }
        }
    });
};

Vue.use(Plugin);

export default Plugin;
