package com.softycon.enum_data_types;

enum Grade{
    A,B,C,D,E;
}
public class Student {
    private int studentID, scholarshipAmount, totalMarks;
    private String name;
    private Grade grade;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }


    void calculateGrade(){
        if(totalMarks >= 250){
            grade = Grade.A;
        } else if (totalMarks >= 200 && totalMarks < 250) {
            grade = Grade.B;
        } else if (totalMarks >= 175 && totalMarks < 200) {
            grade = Grade.C;
        } else if (totalMarks >= 150 && totalMarks < 175) {
            grade = Grade.D;
        } else {
            grade = Grade.E;
        }
    }
    void calculateScholarshipAmount(){
        switch (grade){
            case A:
                scholarshipAmount = 5000;
                break;
            case B:
                scholarshipAmount = 4000;
                break;
            case C:
                scholarshipAmount = 3000;
                break;
            case D:
                scholarshipAmount = 2000;
                break;
            default:
                scholarshipAmount = 0;
        }
    }
}
