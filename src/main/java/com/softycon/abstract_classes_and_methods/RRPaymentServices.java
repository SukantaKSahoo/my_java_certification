package com.softycon.abstract_classes_and_methods;

abstract public class RRPaymentServices {
    protected double balance;
    private int customerID;

    RRPaymentServices(int customerID, double balance){
        this.customerID = customerID;
        this.balance = balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public int getCustomerID(){
        return customerID;
    }
    abstract public void payBill(double amount);
}
