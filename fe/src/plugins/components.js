import Vue from 'vue';

function create(Vue) {
    const components = {
        message: {
            info: Vue.prototype.$Message.info,
            success: Vue.prototype.$Message.success,
            warning: Vue.prototype.$Message.warning,
            error: Vue.prototype.$Message.error,
            loading: Vue.prototype.$Message.loading
        },
        notice: {
            open: Vue.prototype.$Notice.open,
            info: Vue.prototype.$Notice.info,
            success: Vue.prototype.$Notice.success,
            warning: Vue.prototype.$Notice.warning,
            error: Vue.prototype.$Notice.error
        },
        loading: {
            start: Vue.prototype.$Loading.start,
            finish: Vue.prototype.$Loading.finish,
            error: Vue.prototype.$Loading.error,
            update: Vue.prototype.$Loading.update
        }
    };
    window.components = components;
}

create(Vue);

Plugin.install = function(Vue) {
    create(Vue);
};

Vue.use(Plugin);

export default Plugin;
