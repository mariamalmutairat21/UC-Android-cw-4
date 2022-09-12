package com.example.eng;

public class Student {
    private String studentName;
    private int studentAge;
    private int studentImg;

    public Student(String studentName, int studentAge, int studentImg) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentImg = studentImg;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(int studentImg) {
        this.studentImg = studentImg;
    }
}
