<template>
  <div id="app">
    <sNavBar></sNavBar>
    <router-view></router-view>
    <Back-top></Back-top>
    <sFooter></sFooter>
  </div>
</template>

<script>
import NavBar from './components/NavBar';
import Footer from './components/Footer';

export default {
    components: {
        'sNavBar': NavBar,
        'sFooter': Footer
    }
};
</script>

<style>
html {
    position: relative;
    min-height: 100%;
    overflow-x: hidden;
}
body {
    padding-bottom: 180px;
}
#app {
    font-family: "Helvetica Neue",Helvetica,"PingFang SC","Hiragino Sans GB","Microsoft YaHei","微软雅黑",Arial,sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    font-size: 13px;
    padding-bottom: 80px;
}
.container {
    margin-top: 30px;
    padding-left: 30px;
    padding-right: 30px;
    max-width: 1200px;
    margin-right: auto;
    margin-left: auto;
}
.region-title {
    border-bottom: 1px solid #dddee1;
    padding-left: 10px;
    padding-bottom: 10px;
}
</style>
