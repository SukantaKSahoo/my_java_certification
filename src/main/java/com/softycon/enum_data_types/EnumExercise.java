package com.softycon.enum_data_types;

public class EnumExercise {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentID(1000);
        s1.setName("Litu");
        s1.setTotalMarks(280);
        s1.calculateGrade();
        s1.calculateScholarshipAmount();

        System.out.println("Student ID : " + s1.getStudentID());
        System.out.println("Student Name : " + s1.getName());
        System.out.println("Student Grade : " + s1.getGrade());
        System.out.println("Student Scholarship Amount is : " + s1.getScholarshipAmount());
    }
}
