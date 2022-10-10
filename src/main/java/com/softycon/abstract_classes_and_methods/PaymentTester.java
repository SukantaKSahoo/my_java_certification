package com.softycon.abstract_classes_and_methods;

public class PaymentTester {
    public static void main(String[] args) {
        ShoppingPayment shopping1 = new ShoppingPayment(1001, 5000);
        shopping1.payBill(5000);
        shopping1.payBill(3000);
        ShoppingPayment shopping2 = new ShoppingPayment(1001, 3000);
        shopping2.payBill(3000);
        shopping2.payBill(5000);
        CreditCardPayment credit1 = new CreditCardPayment(5001, 10000);
        credit1.payBill(15000);
        CreditCardPayment credit2 = new CreditCardPayment(5002, 10000);
        credit2.payBill(5000);
    }
}
