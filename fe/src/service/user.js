import Vue from 'vue';

async function register(username, password) {
    const fd = new FormData();
    fd.append('username', username);
    fd.append('password', password);
    const result = await Vue.prototype.$http.post('/account/register', null, fd);
    return result.data;
}

async function login(username, password) {
    const fd = new FormData();
    fd.append('username', username);
    fd.append('password', password);
    const result = await Vue.prototype.$http.post('/account/login', null, fd);
    return true;
}

export default {
    register,
    login
};
