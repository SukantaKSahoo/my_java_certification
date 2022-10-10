package com.softycon.data_types;

public class ScopeOfVariables {
    int i;
    {
        i = 5;
        System.out.println(i);
        i = 7;
        System.out.println(i);
    }
    String instanceVar = "Default Instance Variable";
    private String privateInstanceVar = "Private Instance Variable";

    static String staticVar = "Default Static Variable";
    void localVarDemo(){
        String localVar = "Default Local Variable";
        System.out.println("Value of the local variable [Inside the Method] is : " + localVar);
        instanceVar = "New Instance Variable";
        System.out.println(instanceVar);
        privateInstanceVar = "Private";
    }

    public static void main(String[] args) {
        System.out.println("\n========================== Default Variables Demo ========================\n");
        System.out.println("Static Variable [Without Object Creation] is : " + staticVar);
        ScopeOfVariables sov = new ScopeOfVariables();
        /*
        System.out.println("Value of Instance Variable [With Object Creation] is : " + sov.instanceVar);
        sov.localVarDemo();
        System.out.println("\n========================== Default Variables Demo ========================\n");
        System.out.println("Value of Private Instance Variable [With Object Creation] is : " + sov.privateInstanceVar);*/
    }

}
