<template>
    <div class="container">
        <Card class="card">
            <p slot="title">注册</p>
            <Form ref="formInline" :model="formInline" :rules="ruleInline">
                <Form-item label="邮箱" prop="email">
                    <Input type="text" v-model="formInline.email" placeholder="请输入邮箱"></Input>
                </Form-item>
                <Form-item label="密码" prop="password">
                    <Input type="password" v-model="formInline.password" placeholder="请输入密码"></Input>
                </Form-item>
                <Form-item label="确认密码" prop="confirmPassword">
                    <Input type="password" v-model="formInline.confirmPassword" placeholder="请再次输入密码"></Input>
                </Form-item>
            </Form>
            <i-button type="primary" @click="handleSubmit('formInline')">下一步</i-button>
        </Card>
    </div>
</template>
<script>
import user from '@/service/user';

export default {
    data() {
        return {
            formInline: {
                email: '',
                password: ''
            },
            ruleInline: {
                email: [
                    {
                        required: true,
                        message: '请填写邮箱',
                        trigger: 'blur'
                    }
                ],
                password: [
                    {
                        required: true,
                        message: '请填写密码',
                        trigger: 'blur'
                    },
                    {
                        type: 'string',
                        min: 6,
                        message: '密码长度不能小于6位',
                        trigger: 'blur'
                    }
                ],
                confirmPassword: [
                    {
                        required: true,
                        message: '请再次填写密码',
                        trigger: 'blur'
                    }
                ]
            }
        };
    },
    methods: {
        async handleSubmit(name) {
            this.$refs[name].validate(async(valid) => {
                if (valid) {
                    await user.register(this.formInline.email, this.formInline.password);
                    
                    this.$parent.current++;
                    this.$router.push('/user/register/second');
                    return true;
                } else {
                    this.$Message.error(valid);
                }
            });
        }
    }
};
</script>
