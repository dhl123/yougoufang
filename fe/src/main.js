import Vue from 'vue';
import './plugins/axios';
import App from './App.vue';
import router from './router';
import store from './store';
import './registerServiceWorker';
import './plugins/iview.js';
import './plugins/service.js';
import './plugins/components.js';

import {sync} from 'vuex-router-sync';
import VueLazyload from 'vue-lazyload';
import 'normalize.css';

import HouseCard from './components/HouseCard.vue';

sync(store, router);

Vue.use(VueLazyload, {
    preLoad: 1.3,
    attempt: 1,
    lazyComponent: true
});

Vue.filter('localeTime', value => new Date(value).toLocaleString('zh-cn', {
    hour12: false
}));

Vue.config.productionTip = false;

new Vue({
    router,
    store,
    render: h => h(App),
    components: {
        HouseCard
    }
}).$mount('#app');
