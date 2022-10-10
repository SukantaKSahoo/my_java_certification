package com.softycon.classes_and_objects;

public class Demo {
    int phone;
    double getPhone(){
        System.out.println("phone number received");
        return phone;
    }

    public static void main(String[] args) {
        Demo test = new Demo();
        test.phone = 123;
        System.out.println(test.getPhone());
    }
}
