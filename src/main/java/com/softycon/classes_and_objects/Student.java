package com.softycon.classes_and_objects;

public class Student {

    private int studentId;
    private String name;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOfEng;

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }
    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public int getStudentId(){
        return studentId;
    }
        public String getName() {
        return name;
    }
    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }
    public char getResidentialStatus() {
        return residentialStatus;
    }
    public int getYearOfEng() {
        return yearOfEng;
    }
    public void setYearOfEng(int yearOfEng) {
        this.yearOfEng = yearOfEng;
    }

    public String getFullResidentialStatus() {
        if(getResidentialStatus()=='H')
            return "Hostellers";
        else if (getResidentialStatus()=='D')
            return "Day Scholar";
        return "Not Known";
    }

    public String toString(){
        String output = "Output:\n\n"
                +"Student Name\t\t\t:\t"+getName()+"\n"
                +"Student ID\t\t\t\t:\t"+getStudentId()+"\n"
                +"Qualifying Marks\t\t:\t"+getQualifyingExamMarks()+"\n"
                +"Years of Engineering\t:\t"+getYearOfEng()+"\n"
                +"Residential Status\t\t:\t" +getFullResidentialStatus();
        return output;
    }
}
