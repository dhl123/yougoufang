import Vue from 'vue';
import Router from 'vue-router';

Vue.use(Router);

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        {
            path: '/',
            name: 'index',
            component: () => import('./pages/Index.vue')
        }, {
            path: '/house',
            name: 'house',
            component: () => import('./pages/house/HouseContainer.vue'),
            children: [
                {
                    path: '',
                    name: '',
                    component: () => import('./pages/house/HouseIndex.vue')
                },
                {
                    path: 'detail/:id',
                    component: () => import('./pages/house/HouseDetail.vue')
                }
            ]
        }, {
            path: '/user/login',
            name: 'userLogin',
            component: () => import('./pages/user/Login.vue')
        }, {
            path: '/user/register',
            name: 'userRegister',
            component: () => import('./pages/user/register/Container.vue'),
            children: [
                {
                    path: '',
                    name: 'first',
                    component: () => import('./pages/user/register/First.vue')
                }, {
                    path: 'second',
                    name: 'second',
                    component: () => import('./pages/user/register/Second.vue')
                }, {
                    path: 'third',
                    component: () => import('./pages/user/register/Third.vue')
                }
            ]
        }
    ]
});
