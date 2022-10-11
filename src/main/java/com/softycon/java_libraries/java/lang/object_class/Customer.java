package com.softycon.java_libraries.java.lang.object_class;

public class Customer {
    private int custID;
    private String custName;

    Customer(int custID, String custName){
        this.custID = custID;
        this.custName = custName;
    }

    public int hashCode(){
        return custID;
    }
    public boolean equals(Object obj){
        Customer customer = (Customer) obj;
        if(this.hashCode() == customer.hashCode()){
            return this.custName.equals(customer.custName);
        }
        return false;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "Ajay");
        Customer customer2 = new Customer(101, "Ajay");
        if(customer1.equals(customer2)){
            System.out.println("Objects are Equal");
        } else {
            System.out.println("Objects are not Equal");
        }
    }
}
