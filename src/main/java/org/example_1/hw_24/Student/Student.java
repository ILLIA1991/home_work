package org.example_1.hw_24.Student;

public class Student {
    private String course;
    private String name;
    private char sex;
    private int age;
    double avgGrade;

    public Student(String course, String name, char sex, int age, double avgGrade) {
        this.course = course;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public String getCourse() {
        return course;
    }


    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }

}
