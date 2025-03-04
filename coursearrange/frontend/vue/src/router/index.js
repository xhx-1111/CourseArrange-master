// src/router/index.js
import { createRouter, createWebHistory } from 'vue-router';
import ScheduleTask from '@/views/ScheduleTask.vue';
import ScheduleTimetable from '@/views/ScheduleTimetable.vue';
import TeacherView from "@/views/TeacherView.vue";
import ClassView from "@/views/ClassView.vue";
import ClassRoom from "@/views/ClassRoom.vue";
import TeachingBuilding from "@/views/TeachingBuilding.vue";
import UserView from "@/views/UserView.vue";

const routes = [
    { path: '/classview', component: ClassView },
    { path: '/teacher', component: TeacherView },
    {
        path: '/schedule',
        redirect: '/schedule/task', // 默认跳转至排课任务
        children: [
            { path: 'task', component: ScheduleTask },
            { path: 'timetable', component: ScheduleTimetable }
        ]
    },
    {
      path: '/classroomresources',
      redirect: '/classroomresources/room',
      children: [
          { path: 'room',component: ClassRoom},
          { path:'building',component: TeachingBuilding }
      ]
    },
    { path: '/user',component: UserView},
    { path: '/', redirect: '/classview' } // 默认跳转至课程管理
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;
