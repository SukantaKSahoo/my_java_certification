package com.softycon.interface_in_java;

public class InterfaceTester {
    public static void main(String[] args) {
        Interns intern = new Interns(7083, 400);
        intern.calculatePercentage();

        Trainee trainee = new Trainee(7483);
        trainee.calculatePercentage();
    }
}
