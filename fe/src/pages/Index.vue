<template>
    <div>
        <div class="header-img">
            <div class="himg" :style="{ backgroundImage: 'url(' + require('../assets/banner.jpg') + ')'}">
                <div class="container" style="text-align: center; margin-top: 0;">
                    <span style="display: inline-flex; margin-top: 400px;">
                        <Input style="width: 500px; margin-right: 20px;" size="large" placeholder="请输入区域、商圈或小区名开始找房">
                            <Select v-model="sel2" slot="prepend" style="width: 80px">
                                <Option value="http">租房</Option>
                            </Select>
                        </Input>
                        <Button type="primary" size="large">搜索</Button>
                    </span>
                </div>
            </div>
        </div>
        <div class="container" style="margin-bottom: 30px">
            <Row :gutter="20">
                <Col span="6">
                    <div class="icon-cont">
                        <img src="../assets/house/i3.png" style="width: 100px; height: 100px;">
                        <p class="head-text">找二手房</p>
                    </div>
                </Col>
                <Col span="6">
                    <div class="icon-cont">
                        <img src="../assets/house/i2.png" style="width: 100px; height: 100px;">
                        <p class="head-text">地图找房</p>
                    </div>
                </Col>
                <Col span="6">
                    <div class="icon-cont">
                        <img src="../assets/house/i1.png" style="width: 100px; height: 100px;">
                        <p class="head-text">找地铁房</p>
                    </div>
                </Col>
                <Col span="6">
                    <div class="icon-cont">
                        <img src="../assets/house/i4.png" style="width: 100px; height: 100px;">
                        <p class="head-text">找出租房</p>
                    </div>
                </Col>
            </Row>
            <Row>
                <div class="img-section">
                    <h1>精选房源</h1>
                    <p>好房源那么多，我们为你精选，会越来越懂你 <a style="float:right;" href="#"> 查看更多 <Icon type="ios-arrow-forward" /> </a></p>
                    <p>&nbsp;</p>
                    <Row :gutter="20">
                        <Col span="6">
                            <Card :padding="0">
                                <p slot="title">公务员单位房 中高楼层</p>
                                <img class="houseimg" src="../assets/house/1.jpg">
                                <p class="desc-text">东城区  1室1厅  100平米</p>
                            </Card>
                        </Col>
                        <Col span="6">
                            <Card :padding="0">
                                <p slot="title">三房，户型周正，两房朝阳</p>
                                <img class="houseimg" src="../assets/house/2.jpg">
                                <p class="desc-text">西城区  2室2厅  125平米</p>
                            </Card>
                        </Col>
                        <Col span="6">
                            <Card :padding="0">
                                <p slot="title">此房满三年，采光好，交通方便</p>
                                <img class="houseimg" src="../assets/house/4.jpg">
                                <p class="desc-text">南城区  1室1厅  100平米</p>
                            </Card>
                        </Col>
                        <Col span="6">
                            <Card :padding="0">
                                <p slot="title">精装两房 户型格局好 价格美丽</p>
                                <img class="houseimg" src="../assets/house/3.jpg">
                                <p class="desc-text">北城区  3室2厅  200平米</p>
                            </Card>
                        </Col>
                    </Row>
                </div>
            </Row>
        </div>
    </div>
</template>
<style>
.ivu-carousel-list {
    width: 100%;
}
</style>
<style scoped>
.ca-cnt {
    text-align: center;
}
.himg {
    width: 100%;
    height: 500px;
    object-fit: cover;
    background-size: cover;
}
.img-section {
    margin-top: 30px;
    width: 100%;
    text-align: left;
}
.img-section2 {
    width: 100%;
    background-color: #a6b5ff;
    text-align: center;
}
.houseimg {
    width: 100%;
    height: 200px;
    object-fit: cover;
}
.secimg {
    height: 450px;
}
.head-text {
    font-weight: bold;
    font-size: 15px;
}
.icon-cont {
    text-align: center;
}
.desc-text {
    font-weight: bold;
    font-size: 12px;
    color: gray;
    padding-left: 10px;
    padding-right: 10px;
    padding-top: 5px;
    padding-bottom: 10px;
}
</style>
<script>
export default {
    data() {
        return {
            pid: null,
            sel2: 'http'
        };
    },
    methods: {
        CenterClick() {
            this.$router.push('/user');
        },
        MyExamClick() {
            this.$router.push('/user/history');
        },
        RegisterClick() {
            this.$router.push('/user/register');
        },
        LoginClick() {
            this.$router.push('/user/login');
        }
    }
};
</script>
