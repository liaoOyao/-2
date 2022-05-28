import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
//引入antd组件
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/antd.css';
import * as Icons  from '@ant-design/icons-vue';//圖標
const app=createApp(App);
app.use(store).use(router).use(Antd).mount('#app');
// 全局使用圖表
const  icons: any =Icons;
for (const i in Icons) {
    app.component(i,icons[i]);

}
console.log('环境',process.env.NODE_ENV);
console.log('客户端',process.env.VUE_APP_INTERFACE_URL);
console.log('客户端',process.env.BASE_URL);
console.log('客户端',process.env);

