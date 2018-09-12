import Vue from 'vue';

async function getComment(houseId) {
    const fd = new FormData();
    fd.append('houseId', houseId);
    const result = await Vue.prototype.$http.post('/review/getComment', null, fd);
    return result.data;
}

export default {
    getComment
};
