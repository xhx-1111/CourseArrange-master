<template>
  <el-aside class="sidebar">
    <!-- 菜单导航 -->
    <el-menu
        :default-active="activeIndex"
        class="menu"
        background-color="#f4f4f4"
        text-color="#333"
        active-text-color="#e94e77"
        @select="handleSelect"
        router
    >
      <!-- 课程管理 -->
      <el-menu-item index="/classview">班级管理</el-menu-item>

      <!-- 教师管理 -->
      <el-menu-item index="/teacher">教师管理</el-menu-item>

      <!-- 排课管理 (父组件导航) -->
      <el-sub-menu index="schedule">
        <template #title>排课管理</template>

        <!-- 子组件：排课任务 -->
        <el-menu-item index="/schedule/task">排课任务</el-menu-item>

        <!-- 子组件：课表 -->
        <el-menu-item index="/schedule/timetable">课表</el-menu-item>
      </el-sub-menu>

      <el-sub-menu index="classroomresources">
        <template #title>教室资源</template>

        <!-- 子组件：排课任务 -->
        <el-menu-item index="/classroomresources/building">教学楼管理</el-menu-item>

        <!-- 子组件：课表 -->
        <el-menu-item index="/classroomresources/room">教室管理</el-menu-item>
      </el-sub-menu>

      <el-menu-item index="/user">用户管理</el-menu-item>
    </el-menu>
  </el-aside>
</template>

<script>
export default {
  name: 'AppSidebar',
  data() {
    return {
      activeIndex: this.$route.path // 根据当前路由设置默认激活项
    };
  },
  watch: {
    // 监听路由变化，实时更新激活项
    $route(to) {
      this.activeIndex = to.path;
    }
  },
  methods: {
    // 处理菜单点击，使用 $router 进行导航
    handleSelect(index) {
      this.$router.push(index);
    }
  }
};
</script>

<style scoped>
.sidebar {
  width: 220px;
  background-color: #ffffff;
  height: calc(100vh - 60px); /* 高度减去顶部导航栏 */
  padding-top: 20px;
}

.menu {
  width: 100%;
}
</style>
