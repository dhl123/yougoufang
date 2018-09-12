<template>
    <div class="container">
        <Row class="region-title">
            <span style="display: inline-flex">
                <Input style="width: 500px; margin-right: 20px;" size="large" placeholder="请输入区域、商圈或小区名开始找房">
                    <Select v-model="sel2" slot="prepend" style="width: 80px">
                        <Option value="http">租房</Option>
                    </Select>
                </Input>
                <Button type="primary" size="large">搜索</Button>
                &nbsp;&nbsp;
                <span style="float: right">
                    <Button icon="location" size="large">地图找房</Button>
                </span>
            </span>
        </Row>
        <Row>
            &nbsp;
        </Row>
        <Row :gutter="16">
            <Col span="6">
                <Menu theme="light" :active-name="actName" @on-select="MenuSelect">
                    <Menu-item name="">
                        全部
                    </Menu-item>
                    <Menu-item name="before">
                        地铁租房
                    </Menu-item>
                </Menu>
            </Col>
            <Col span="18">
                <router-view></router-view>
            </Col>
        </Row>
    </div>
</template>
<script>
export default {
    data() {
        return {
            pid: null,
            sel2: 'http'
        };
    },
    computed: {
        actName() {
            return this.$route.name;
        }
    },
    methods: {
        MenuSelect(name) {
            this.$router.push('/house/' + name);
        }
    }
};
</script>
