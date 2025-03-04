<template>
  <el-header class="header">
    <div class="logo">排课系统</div>
    <div class="user-info">Welcome, User</div>
  </el-header>
</template>

<script>
export default {
  name: 'AppHeader'
}
</script>

<style scoped>
.header {
  background-color: #e94e77; /* 和谐的红色 */
  color: white;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 20px;
  height: 60px;
}

.logo {
  font-size: 18px;
}

.user-info {
  font-size: 14px;
}
</style>
