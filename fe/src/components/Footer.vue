<template>
    <footer>
        <Row>
            <p class="footer-rel sitemap-item">
                <a href="http://www.csu.edu.cn">首页</a>&nbsp;|
                <a href="http://www.csu.edu.cn">联系方式</a>&nbsp;|
                <a href="http://www.csu.edu.cn">关于</a>&nbsp;|
                <a href="http://www.miibeian.gov.cn">...备案号...</a>
            </p>
            <p class="footer-rel"> Company Name © 2018, All rights reserved.</p>
        </Row>
	</footer>
</template>
<style scoped>
footer {
    position: absolute;
    background-color: #fff;
    width: 100%;
    bottom: 0px;
    border-top: 1px solid #dddee1;
    padding-bottom: 10px;
}
.sitemap-item {
    font-size: 12px;
    color: #dddee1;
    text-decoration: none;
    transition: color 80ms linear;
    margin-top: 8px;
    margin-bottom: 4px;
}
.sitemap-item a {
    font-size: 12px;
    color: #495060;
    text-decoration: none;
    transition: color 80ms linear;
}
.sitemap-item a:hover {
    color: #2d8cf0;
}
.footer-rel {
    text-align: center;
    font-size: 12px;
    color: #495060;
}
</style>
