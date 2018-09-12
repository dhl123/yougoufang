<template>
    <div class="container">
        <Row>
            &nbsp;
        </Row>
        <Steps :current="currentStep">
            <Step title="注册"></Step>
            <Step title="实名认证"></Step>
            <Step title="信息审核"></Step>
        </Steps>
         <Row>
            &nbsp;
        </Row>
        <router-view></router-view>
         <Row>
            &nbsp;
        </Row>
    </div>
</template>
<script>
export default {
    data() {
        return {
            currentStep: 0
        };
    }
};
</script>
