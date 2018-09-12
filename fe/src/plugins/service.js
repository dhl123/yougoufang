import Vue from 'vue';

import user from '../service/user';

Plugin.install = function(Vue) {
    Object.defineProperties(Vue.prototype, {
        $service: {
            get() {
                return {
                    user
                };
            }
        }
    });
};

Vue.use(Plugin);

export default Plugin;
