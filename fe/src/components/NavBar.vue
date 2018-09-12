<template>
    <div class="nav-menu">
        <a href="#" class="title-link">
            <div class="left-menu">
                <span class="title-text">&nbsp;优租房</span>
                <span class="title-text" style="font-size: 18px">
                    <Dropdown>
                        <a href="javascript:void(0)">
                            长沙
                            <Icon type="ios-arrow-down"></Icon>
                        </a>
                        <DropdownMenu slot="list">
                            <DropdownItem>驴打滚</DropdownItem>
                            <DropdownItem>炸酱面</DropdownItem>
                            <DropdownItem disabled>豆汁儿</DropdownItem>
                            <DropdownItem>冰糖葫芦</DropdownItem>
                            <DropdownItem divided>北京烤鸭</DropdownItem>
                        </DropdownMenu>
                    </Dropdown>
                </span>
            </div>
        </a>
        <Menu class="right-menu" mode="horizontal" theme="light" :active-name="actName" @on-select="NavMenuClick">
            <Menu-item name="/">
                <Icon type="ios-home"></Icon>
                首页
            </Menu-item>
            <Menu-item name="/house">
                <Icon type="ios-apps"></Icon>
                租房
            </Menu-item>
            <Menu-item name="/host/login">
                <Icon type="ios-people"></Icon>
                业主
            </Menu-item>
            <Submenu name="/user" v-if="this.$store.state.user.username !== undefined">
                <template slot="title">
                    <Icon type="person"></Icon>
                    {{ this.$store.state.user.username }}
                </template>
                <Menu-item name="/user">个人中心</Menu-item>
                <Menu-item name="/user/logout">退出登录</Menu-item>
            </Submenu>
            <Menu-item name="/user/login" v-else>
                <Icon type="ios-person"></Icon>
                登录 | 注册
            </Menu-item>
        </Menu>
    </div>
</template>
<style scoped>
.title-link {
    color: #1c2438;
}
.nav-menu {
    width: 100%;
    background-color: white;
    border-bottom: 1px solid #dddee1;
    height: 60px;
}
.left-menu {
    float: left;
    display: table;
}
.logo-img {
    margin-top: 12px;
    height: 35px;
    margin-left: 5px;
}
.right-menu {
    float: right;
    margin-right: 20px;
}
.title-text {
    font-size: 22px;
    vertical-align: middle;
    display: table-cell;
    line-height: 60px;
    padding-left: 10px;
}
</style>
<script>
export default {
    computed: {
        actName() {
            if (this.$route.fullPath.startsWith('/exam')) {
                return '/exam';
            }
            if (this.$route.fullPath === '/user/login' || this.$route.fullPath.startsWith('/user/register')) {
                return '/user/login';
            }
            if (this.$route.fullPath.startsWith('/user')) {
                return '/user';
            }
            if (this.$route.fullPath.startsWith('/company')) {
                return '/company/login';
            }
            return '/';
        }
    },
    methods: {
        NavMenuClick(text) {
            this.$router.push(text);
        }
    }
};
</script>
