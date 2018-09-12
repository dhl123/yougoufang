<template>
    <div class="container">
        <Card class="card">
            <p slot="title">实名认证</p>
            <Form ref="formInline" :model="formInline" :rules="ruleInline">
                <Form-item label="实名认证信息" prop="avatar">
                    <Upload :action="baseURL + '/upload/'" name="myFile">
                        <Button icon="ios-cloud-upload-outline">上传身份证正反面</Button>
                    </Upload>
                </Form-item>
                <Form-item label="姓名" prop="username">
                    <Input type="text" v-model="formInline.username" placeholder="请填写姓名，与上传身份证一致"></Input>
                </Form-item>
                <Form-item label="身份证号" prop="username">
                    <Input type="text" v-model="formInline.name" placeholder="请填写身份证号，与上传身份证一致"></Input>
                </Form-item>
                <Form-item label="手机号" prop="username">
                    <Input type="text" v-model="formInline.name" placeholder="用于辅助实名认证"></Input>
                </Form-item>
            </Form>
            <i-button type="primary" @click="handleSubmit('formInline')">下一步</i-button>
        </Card>
    </div>
</template>
<script>
export default {
    data() {
        return {
            formInline: {
                username: '',
                name: '',
                major: ''
            },
            ruleInline: {
                username: [
                    {
                        required: true,
                        message: '请填写用户名',
                        trigger: 'blur'
                    }
                ]
            },
            majorList: [],
            model1: ''
        };
    },
    beforeRouteEnter(to, from, next) {
        // if (window.components.store.state.registerTempInfo.id === undefined) {
        //     window.components.router.push('/user/login');
        //    return;
        // }
        next();
    },
    async created() {
        // this.majorList = await user.getType();
        // this.formInline.major = this.$store.state.registerTempInfo.major;
    },
    methods: {
        async handleSubmit(name) {
            /*
            this.$refs[name].validate(async(valid) => {
                if (valid) {
                    /*
                    const result = await user.register(this.)
                    if (result) {
                        this.$parent.current++;
                        this.$router.push('/user/register/third');
                    }
                    return result;
                    */
            /*
                } else {
                    return false;
                }
            });
            */
            this.$parent.current++;
            this.$router.push('/user/register/third');
        }
    }
};
</script>
