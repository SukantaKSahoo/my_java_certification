package com.softycon.abstract_classes_and_methods;

public class ShoppingPayment extends RRPaymentServices{
    private static int counter = 0;
    private String paymentID;

    ShoppingPayment(int customerID, double balance){
        super(customerID, balance);
    }

    private String getPaymentID(){
        String intID = Integer.toString(counter);
        for(int i = 1; intID.length()<4; i++)
        {
            intID = "0" + intID;
        }
        paymentID = "S-" + intID;
        return paymentID;
    }

    public void payBill(double amount){
        if (amount == balance){
            counter++;
            balance = balance - amount;
            System.out.println("Congratulations !!! Your Payment of Rs. " + amount + " is successful with Payment ID : " + getPaymentID());
        } else if(amount<balance){
            System.out.println("Insufficient amount entered !!! Please try again.");
        } else
        {
            System.out.println("Excess amount entered !!! Please try again.");
        }

    }
}
