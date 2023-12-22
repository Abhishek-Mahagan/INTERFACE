package interview;

import java.util.List;

public class Student
{
    String Student_Name;
    int age;
    List<String> Course;

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCourse() {
        return Course;
    }

    public void setCourse(List<String> course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student_Name='" + Student_Name + '\'' +
                ", age=" + age +
                ", Course=" + Course +
                '}';
    }

    public Student(String student_Name, int age, List<String> course) {
        Student_Name = student_Name;
        this.age = age;
        Course = course;
    }

    public Student() {
    }
}
