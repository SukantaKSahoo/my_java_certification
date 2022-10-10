package com.softycon.data_types;

public class ScopeOfVariableTester {
    public static void main(String[] args) {
        System.out.println("========================== Default Variables Demo ========================");
//        We can access static [class] variables without creating the object
        System.out.println("Value of Static Variable [With Class] is : " + ScopeOfVariables.staticVar);

        ScopeOfVariables sov = new ScopeOfVariables();
//        We can also access static [class] variables with the object of the  class
        System.out.println("Value of Static Variable [With Object] is : " + sov.staticVar);
//        To access the instance variables we need to create the object of the class
        System.out.println("Value of Instance Variable [With Object Only] is : " + sov.instanceVar);
//        To access any local variable declared inside a method we need to call the method
        sov.localVarDemo();
        System.out.println("========================== Private Variables Demo ========================");
        System.out.println("Private Variables can't be accessed outside the Class");
    }
}
