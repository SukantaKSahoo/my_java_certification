package com.softycon.inheritance;

class Customer extends Person{
    int salary;
    Customer(int salary){
        this.salary=salary;
        name="Maddy";
    }

    public void displayDetails(){
        System.out.println(name+"'s Salary is : "+salary);
    }
}