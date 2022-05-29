import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
//引入antd组件
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/antd.css';
import * as Icons  from '@ant-design/icons-vue';//圖標
import axios from "axios";
axios.defaults.baseURL = process.env.baseURL;
const app=createApp(App);
app.use(store).use(router).use(Antd).mount('#app');
// const modules = import.meta.glob('./dir/*.js')

// 全局使用圖表
const  icons: any =Icons;
for (const i in Icons) {
    app.component(i,icons[i]);

}

// axios.defaults.baseURL=process.env.VUE_APP_INTERFACE_URL;

console.log('环境：', process.env.NODE_ENV);
console.log('服务端：', process.env.VUE_APP_SERVER);


/**
 * axios拦截器
 */
axios.interceptors.request.use(function (config) {
    console.log('请求参数：', config);

    return config;
}, error => {
    return Promise.reject(error);
});
// console.log('环境',process.env.NODE_ENV);
// console.log('环境',process.env.BASE_URL);
// console.log('客户端',process.env.VUE_APP_INTERFACE_URL);
// console.log('客户端',process.env.BASE_URL);
// console.log('客户端',process.env);

