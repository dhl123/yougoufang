<template>
    <div class="container">
        <Row>&nbsp;</Row>
        <Row :gutter="16">
            <Col span="16" style="text-align: center">
                <img src="../../assets/timg.png" style="height: 420px;">
            </Col>
            <Col span="8">
            <Card class="card">
                <p slot="title" style="text-align: center">登录</p>
                <Form ref="formInline" :model="formInline">
                    <Form-item label="邮箱/用户名" prop="user">
                        <Input type="text" v-model="formInline.user" placeholder="请输入邮箱或用户名"></Input>
                    </Form-item>
                    <Form-item label="密码" prop="password">
                        <Input type="password" v-model="formInline.password" placeholder="请输入密码"></Input>
                    </Form-item>
                    <Form-item>
                        <Checkbox>下次自动登录</Checkbox>
                        <Button type="text" style="float: right">忘记密码?</Button>
                    </Form-item>
                    <Form-item>
                        <Button type="primary" size="large" @click="handleSubmit('formInline')" long>登录</Button>
                    </Form-item>
                    <div class="login-extend">
                        <p>还没有账号？ &nbsp;&nbsp;&nbsp;    <router-link to="/user/register">立即注册</router-link></p>
                    </div>
                </Form>
            </Card>
            </Col>
        </Row>
    </div>
</template>
<style scoped>
.login-extend {
    padding-top: 20px;
    border-top: 1px solid #dddee1;
}
</style>
<script>
import user from '@/service/user';

export default {
    data() {
        return {
            formInline: {
                user: '',
                password: ''
            }
        };
    },
    methods: {
        handleRegister() {
            this.$router.push('/user/register');
        },
        handleSubmit(name) {
            this.$refs[name].validate((valid) => {
                if (valid) {
                    if (user.login(this.formInline.user, this.formInline.password)) {
                        this.$store.commit('setUser', {
                            username: this.formInline.user,
                            password: this.formInline.password
                        });
                        this.$router.push('/house');
                    } else {
                        this.$Message.error('用户名或密码错误!');
                    }
                } else {
                    this.$Message.error('表单验证失败!');
                }
            });
        }
    }
};
</script>
