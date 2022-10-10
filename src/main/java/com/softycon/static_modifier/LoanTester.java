package com.softycon.static_modifier;

public class LoanTester {
    public static void main (String[] args){
        //Create 2 objects of Loan class using the default and 2 using parametrized constructor.
        Loan loan1 = new Loan();
        System.out.println("Loan Counter for Loan 01 is : " + Loan.getLoanCounter());
        Loan loan2 = new Loan(100,1,1000,1,10);
        //Use getter methods and display the value of loanCounter for every instance
        System.out.println("Loan Counter for Loan 02 is : " + Loan.getLoanCounter());
    }
}
