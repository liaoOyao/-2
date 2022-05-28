<template>
  <a-layout>
    <the-header></the-header>
      <router-view/>
    <a-layout-footer style="text-align: center">
    传不习乎？知识分享库 Design ©2018 Created By  SSPU-LiaoLiao
     </a-layout-footer>
  </a-layout>
</template>
<script lang="ts">
import {defineComponent} from "vue";
import TheHeader from '@/components/the-header.vue';
export default defineComponent({
  name: 'app',
components:{
    TheHeader,
},
});
</script>

<style>
#components-layout-demo-top-side-2 .logo {
  width: 120px;
  height: 31px;
  margin: 16px 28px 16px 0;
  background: rgba(255, 255, 255, 0.2);
  float: left;
}

.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>
