<template>
    <div>
        <Row>
            <HouseCard :data="{}" />
        </Row>
        <Row>
            <Col :span="16">
                <Tabs value="tabs">
                    <TabPane label="detail" name="detail">
                    </TabPane>
                    <TabPane label="comment" name="comment">
                        
                    </TabPane>
                    <TabPane label="question" name="question">
                    </TabPane>
                </Tabs>
            </Col>
            <Col :span="8">
                <Card>
                    <p slot="title">
                        Action
                    </p>
                    <Row>
                        <Button size="large" type="primary">Request</Button>
                    </Row>
                    <Row>&nbsp;</Row>
                    <Row>
                        <Button size="large" type="primary">Apply</Button>
                    </Row>
                </Card>
            </Col>
        </Row>
    </div>
</template>
<style scoped>
</style>
<script>
export default {
    data() {
        return {
            houseData: {
                description: 'description',
                type: 'type',
                area: 100,
                location: 'location',
                floor: 1,
                createdAt: new Date().toISOString(),
                updatedAt: new Date().toISOString(),
                rentMoney: 1000
            },
            tabs: 'detail'
        };
    }
};
