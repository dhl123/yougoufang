<template>
    <div>
        <Row>
            <Card>
                <Row>
                    <Row class="selection-row">
                        <span class="label">区域：</span>
                        <RadioGroup v-model="radioLocation">
                            <Radio label="all">全部</Radio>
                            <Radio label="furong">芙蓉区</Radio>
                            <Radio label="tianxin">天心区</Radio>
                            <Radio label="yuelu">岳麓区</Radio>
                            <Radio label="yuhua">雨花区</Radio>
                            <Radio label="wancheng">望城区</Radio>
                            <Radio label="changshaxian">长沙县</Radio>
                        </RadioGroup>
                    </Row>
                    <Row class="selection-row">
                        <span class="label">租金：</span>
                        <CheckboxGroup v-model="cbRentMoney">
                            <Checkbox label="1">1000元以下</Checkbox>
                            <Checkbox label="2">1000-2000元</Checkbox>
                            <Checkbox label="4">2000-3000元</Checkbox>
                            <Checkbox label="8">3000元-4000元</Checkbox>
                            <Checkbox label="16">4000元-5000元</Checkbox>
                            <Checkbox label="32">5000元以上</Checkbox>
                        </CheckboxGroup>
                        <Input v-model="txRentMoneyLowerBound" size="small" style="width: 80px"/>
                        <span> ~ </span>
                        <Input v-model="txRentMoneyUpperBound" size="small" style="width: 80px"/>
                        &nbsp;<Button size="small" type="primary">确定</Button>
                    </Row>
                    <Row class="selection-row">
                        <span class="label">面积：</span>
                        <CheckboxGroup v-model="cbArea">
                            <Checkbox label="1">50平以下</Checkbox>
                            <Checkbox label="2">50-75平</Checkbox>
                            <Checkbox label="4">75-100平</Checkbox>
                            <Checkbox label="8">100-150平</Checkbox>
                            <Checkbox label="16">150-200平</Checkbox>
                            <Checkbox label="32">200平以上</Checkbox>
                        </CheckboxGroup>
                        <Input v-model="txAreaLowerBound" size="small" style="width: 80px"/>
                        <span> ~ </span>
                        <Input v-model="txAreaUpperBound" size="small" style="width: 80px"/>
                        &nbsp;<Button size="small" type="primary">确定</Button>
                    </Row>
                    <Row class="selection-row">
                        <span class="label">房型：</span>
                        <CheckboxGroup v-model="cbType">
                            <Checkbox label="1">一室</Checkbox>
                            <Checkbox label="2">二室</Checkbox>
                            <Checkbox label="4">三室</Checkbox>
                            <Checkbox label="8">四室</Checkbox>
                            <Checkbox label="16">四室以上</Checkbox>
                        </CheckboxGroup>
                    </Row>
                    <Row class="selection-row">
                        <span class="label">排序：</span>
                        <RadioGroup v-model="sel1" type="button">
                            <Radio label="推荐"></Radio>
                            <Radio label="最新"></Radio>
                            <Radio label="租金"></Radio>
                            <Radio label="面积"></Radio>
                            <Radio label="地铁距离"></Radio>
                        </RadioGroup>
                    </Row>
                </Row>
            </Card>
        </Row>
        <Row>&nbsp;</Row>
        <Row>
            <Card>
                <Row>
                    <Row class="selection-row">
                        <span class="label">条件: </span>
                        <Tag closable v-for="(item,key) in condition" :key="key">{{item}}</Tag>
                        <Button type="primary" size="small" @click="clearCondition">清空</Button>
                    </Row>
                </Row>
            </Card>
        </Row>
        <Row>&nbsp;</Row>
        <Row>
            <Card :padding="0">
                <p slot="title">
                    共有 <span style="font-weight:bold; color: red; font-size: 20px;"> {{ arrHouse.length }} </span> 套房源
                </p>
                <Row>
                    <Row v-for="(item, key) in arrHouse" :key="key">
                        <HouseCard :data="item" />
                    </Row>
                 </Row>
            </Card>
            <Row>&nbsp;</Row>
            <Row style="text-align: center">
                <Page :total="10"></Page>
            </Row>
        </Row>
    </div>
</template>
<style>
.item-card .ivu-card-head {
    padding: 0 !important;
}
</style>
<style scoped>
.label {
    font-weight: bold;
}
.selection-row {
    padding-top: 5px;
    padding-bottom: 5px;
}
</style>
<style scoped>
.i {
    width: 100%;
    height: 150px;
    object-fit: cover;
}

.hd {
    padding: 0;
}

.data {
    padding: 10px;
}

.t {
    font-weight: bold;
    font-size: 15px;
}
</style>
<script>
import HouseCard from '@/components/HouseCard.vue';
import houseService from '@/service/house.js';

export default {
    components: {
        HouseCard
    },
    computed: {
        condition() {
            // 1. 把下面的 cbXXXX 读出来
            const cbTypeLabel = this.cbType.map(t => {
                switch (t) {
                case '1': return '一室';
                case '2': return '二室';
                case '4': return '三室';
                }
            });
            // 2. 把 cbXXXX 里面的东西和它的label 关联起来
            // 3. 把 label 添加到一个 数组里
            const newArray = [];
            cbTypeLabel.forEach(t => {
                newArray.push(t);
            });
            // 4. 返回这个数组
            return newArray;
        }
    },
    data() {
        return {
            value: true,
            sel1: '推荐',

            radioLocation: 'all',
            cbRentMoney: [],
            txRentMoneyLowerBound: '',
            txRentMoneyUpperBound: '',
            cbArea: [],
            radioType: '',
            txAreaLowerBound: '',
            txAreaUpperBound: '',
            cbType: [],
            arrHouse: []
        };
    },
    async created() {
        const data = await houseService.getAllHouse();
        this.arrHouse = data;
    },
    methods: {
        clearCondition() {
            this.cbType = [];
        },
        imgSrc(i2) {
            return require('@/assets/indexPaper/' + parseInt(i2 + 1) + '.png');
        }
    }
};
</script>
