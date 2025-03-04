package com.swpu.course.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "classview")
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    @Column(name = "class_id")
    private String classId;

    @Column(name = "class_name")
    private String className;

    @Column(name = "study_duration")
    private String studyDuration;

    @Column(name = "education_level")
    private String educationLevel;

    @Column(name = "class_category")
    private String classCategory;

    @Column(name = "expected_graduationYear")
    private String expectedGraduationYear;

    @Column(name = "is_graduated")
    private String isGraduated;

    @Column(name = "student_count")
    private String studentCount;


    public String getMaxStudentCount() {
        return maxStudentCount;
    }

    public void setMaxStudentCount(String maxStudentCount) {
        this.maxStudentCount = maxStudentCount;
    }

    public int getId() {
        return Math.toIntExact(id);
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStudyDuration() {
        return studyDuration;
    }

    public void setStudyDuration(String studyDuration) {
        this.studyDuration = studyDuration;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getClassCategory() {
        return classCategory;
    }

    public void setClassCategory(String classCategory) {
        this.classCategory = classCategory;
    }

    public String getExpectedGraduationYear() {
        return expectedGraduationYear;
    }

    public void setExpectedGraduationYear(String expectedGraduationYear) {
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public String getIsGraduated() {
        return isGraduated;
    }

    public void setIsGraduated(String isGraduated) {
        this.isGraduated = isGraduated;
    }

    public String getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(String studentCount) {
        this.studentCount = studentCount;
    }

    public String getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(String enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Column(name = "max_student_count")
    private String maxStudentCount;

    @Column(name = "enrollment_year")
    private String enrollmentYear;

    @Column(name = "department")
    private String department;

    @Column(name = "major_id")
    private String majorId;

    @Column(name = "major_name")
    private String majorName;

    @Column(name = "campus")
    private String campus;

    public String getIs_fixed_classroom() {
        return is_fixed_classroom;
    }

    public void setIs_fixed_classroom(String is_fixed_classroom) {
        this.is_fixed_classroom = is_fixed_classroom;
    }

    public String getFixed_classroom() {
        return fixed_classroom;
    }

    public void setFixed_classroom(String fixed_classroom) {
        this.fixed_classroom = fixed_classroom;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Column(name = "fixed_classroom")
    private String fixed_classroom;

    @Column(name = "is_fixed_classroom")
    private String is_fixed_classroom;

}
