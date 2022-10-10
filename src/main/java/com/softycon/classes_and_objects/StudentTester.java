package com.softycon.classes_and_objects;

public class StudentTester {
    public static void main(String[] args) {
        Student jacob = new Student();
        jacob.setStudentId(1001);
        jacob.setName("Jacob");
        jacob.setQualifyingExamMarks(80f);
        jacob.setResidentialStatus('H');
        jacob.setYearOfEng(3);

        System.out.println(jacob);

        Student peter = new Student();
        peter.setStudentId(1002);
        peter.setName("Peter");
        peter.setQualifyingExamMarks(83f);
        peter.setResidentialStatus('D');
        peter.setYearOfEng(2);

        System.out.println(peter);
    }
}
