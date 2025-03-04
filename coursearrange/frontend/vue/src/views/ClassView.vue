<template>
  <div class="classroom">
    <table class="classroom-table">
      <thead>
      <tr>
        <th>序号</th>
        <th>班级编号</th>
        <th>班级名称</th>
        <th>学制</th>
        <th>培养层次</th>
        <th>班级类别</th>
        <th>预计毕业年度</th>
        <th>是否毕业</th>
        <th>班级人数</th>
        <th>班级最大人数</th>
        <th>入学年份</th>
        <th>所属院系</th>
        <th>专业编号</th>
        <th>专业</th>
        <th>校区</th>
        <th>固定教室</th>
        <th>是否固定教室</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="classview in classviews" :key="classview.id">
        <td>{{ classview.id }}</td>
        <td>{{ classview.classId }}</td>
        <td>{{ classview.className }}</td>
        <td>{{ classview.studyDuration }}</td>
        <td>{{ classview.educationLevel }}</td>
        <td>{{ classview.classCategory }}</td>
        <td>{{ classview.expectedGraduationYear }}</td>
        <td>{{ classview.isGraduated ? '是' : '否' }}</td>
        <td>{{ classview.studentCount }}</td>
        <td>{{ classview.maxStudentCount }}</td>
        <td>{{ classview.enrollmentYear }}</td>
        <td>{{ classview.department }}</td>
        <td>{{ classview.majorId }}</td>
        <td>{{ classview.majorName }}</td>
        <td>{{ classview.campus}}</td>
        <td>{{ classview.fixed_classroom}}</td>
        <td>{{ classview.is_fixed_classroom}}</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'ClassView',
  data() {
    return {
      classviews: []
    };
  },
  created() {
    this.fetchClassviews();
  },
  methods: {
    fetchClassviews() {
      axios.get('http://localhost:8080/api/classes')  // 修改为你后端的接口地址
          .then(response => {
            this.classviews = response.data;
          })
          .catch(error => {
            console.error("There was an error fetching the classrooms!", error);
          });
    }
  }
};
</script>

<style scoped>
.classroom {
  background-color: white;
  padding: 20px;
}

.classroom-table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
}

.classroom-table th, .classroom-table td {
  border: 1px solid #ddd;
  padding: 10px;
  text-align: center;
}

.classroom-table th {
  background-color: #f4f4f4;
}
</style>
