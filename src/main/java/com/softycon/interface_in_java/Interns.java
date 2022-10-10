package com.softycon.interface_in_java;

public class Interns implements DataProvider{

    int marksSecured, graceMarks;

    Interns(int marksSecured, int graceMarks){
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    public void calculatePercentage() {
        double totalMarksSecured = marksSecured+graceMarks;
        if(totalMarksSecured<=totalMaximumMarks){
            System.out.println("The total aggregate percentage secured is " + (totalMarksSecured*100)/totalMaximumMarks + " %");
        } else {
            System.out.println("Please enter the correct marks");
        }
    }
}
