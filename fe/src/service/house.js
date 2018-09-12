import Vue from 'vue';

async function getAllHouse() {
    const result = await Vue.prototype.$http.get('/house/findAllHouse');
    return result.data;
}

export default {
    getAllHouse
};
