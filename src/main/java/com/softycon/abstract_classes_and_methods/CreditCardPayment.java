package com.softycon.abstract_classes_and_methods;

public class CreditCardPayment extends RRPaymentServices{

    private static int counter = 0;
    private String paymentID;
    private double cashBack =  0, balanceDue = 0;


    CreditCardPayment(int customerID, double balance){
        super(customerID, balance);
    }

    private String getPaymentID(){
        String intID = Integer.toString(counter);
        for(int i = 1; intID.length()<4; i++)
        {
            intID = "0" + intID;
        }
        paymentID = "C-" + intID;
        return paymentID;
    }

    public void payBill(double amount){
        counter++;
        if (amount >= balance){
            cashBack = amount - balance;
        } else {
            balanceDue = balance - amount;
        }
        System.out.println("\nCongratulations !!! You have successfully made a payment of Rs. " + amount
                + "\tYour Payment Details are :- ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Customer ID :\t" + getCustomerID());
        System.out.println("Payment ID :\t" + getPaymentID());
        System.out.println("Previous Due :\t" + balance);
        System.out.println("Remaining Due :\t" + balanceDue);
        System.out.println("CashBack Received :\t" + cashBack);
    }
}
