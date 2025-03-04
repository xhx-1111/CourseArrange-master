<!-- src/App.vue -->
<template>
  <div id="app">
    <Header />
    <div class="container">
      <Sidebar />
      <div class="content">
        <router-view />
      </div>
    </div>
  </div>
</template>

<script>
import Header from './components/Header.vue';
import Sidebar from './components/Sidebar.vue';

export default {
  components: { Header, Sidebar }
};
</script>

<style scoped>
/* 页面布局样式 */
#app {
  display: flex;
  flex-direction: column;
  height: 100vh;
}

/* 主体内容区域 */
.container {
  display: flex;
  flex: 1;
}

/* 右侧内容区 */
.content {
  flex: 1;
  padding: 20px;
  overflow-y: auto;
}
</style>
