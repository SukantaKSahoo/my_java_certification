package com.softycon.static_modifier;

public class Loan {
    private int loanNo, accountNo, customerNo, loanDuration;
    private float loanAmount, interest;
    private static int loanCounter;

    static {
        loanCounter = 100;
    }

    public int getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public static int getLoanCounter() {
        return loanCounter;
    }

    public Loan() {
//        To count the total number of instances
        loanCounter ++;
    }

    public Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanDuration = loanDuration;
        this.loanAmount = loanAmount;
        this.interest = interest;
        //        To count the total number of instances
        loanCounter ++;
    }
}
