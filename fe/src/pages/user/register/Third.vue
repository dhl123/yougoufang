<template>
    <div class="container">
        <Row>
            <p>我们已经发送了一份确认邮件到邮箱中，请点击邮件中的链接完成账号激活。</p>
        </Row>
        <Row>&nbsp;</Row>
        <Row>
            <i-button type="primary" @click="handleClick">完成</i-button>
        </Row>
    </div>
</template>
<script>
export default {
    methods: {
        handleClick() {
            this.$router.push('/');
        }
    }
};
</script>
