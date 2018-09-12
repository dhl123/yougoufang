<template>
    <Card>
        <Row>
            <Col span="8">
                <img class="houseimg" :src="data.images">
            </Col>
            <Col span="12">
                <p style="color: #2d8cf0; font-weight: bold; font-size: 22px; padding-bottom: 10px;">
                    <router-link :to="'/house/detail/' + data.id">{{ data.description }} </router-link>
                </p>
                <p style="font-weight: bold;">{{ data.type }}  {{ data.area }} 平米</p>
                <p style="color: gray; padding-top: 10px;">{{ data.location }}  / {{ data.floor }} 楼 / {{ data.createdAt.substr(0,4)}} 年建</p>
                <!--<p style="padding-top: 10px"><Tag color="blue">精装修</Tag></p>-->
            </Col>
            <Col span="4">
                <p style="color: red; font-weight: bold; font-size: 22px;">{{ data.rentMoney }} <span style="font-size: 12px">元 / 月</span></p>
                <p style="font-size: 12px; color:grey">{{ data.updatedAt | localeTime }} 更新</p>
            </Col>
        </Row>
    </Card>
</template>
<style scoped>
.houseimg {
    width: 95%;
    height: 200px;
    object-fit: cover;
}
</style>
<script>
export default {
    props: ['data']
};
</script>
