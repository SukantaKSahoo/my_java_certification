package com.softycon.inheritance;

public class ContractEmployee extends Employee{

    private double wage;
    private int hours;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    void calculateSalary(){
        salary = wage * hours;
    }
}
