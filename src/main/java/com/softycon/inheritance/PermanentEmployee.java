package com.softycon.inheritance;

public class PermanentEmployee extends Employee{
    private double basicPay, hra;
    private int experience;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    void calculateSalary(){
        double variableComponent;

        if(experience < 3){
            variableComponent = (basicPay * 0)/100;
        } else if (experience >= 3 && experience < 5) {
            variableComponent = (basicPay * 5)/100;
        } else if (experience >= 5 && experience < 10) {
            variableComponent = (basicPay * 7)/100;
        } else
            variableComponent = (basicPay * 12)/100;

        salary = variableComponent + basicPay + hra;
    }
}
