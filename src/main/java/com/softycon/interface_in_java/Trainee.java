package com.softycon.interface_in_java;

public class Trainee implements DataProvider{

    int marksSecured;

    Trainee(int marksSecured){
        this.marksSecured = marksSecured;
    }

    public void calculatePercentage() {

        if(marksSecured<=totalMaximumMarks){
            System.out.println("The total aggregate percentage secured is " + (marksSecured*100.00)/totalMaximumMarks + " %");
        } else {
            System.out.println("Please enter the correct marks");
        }
    }
}
