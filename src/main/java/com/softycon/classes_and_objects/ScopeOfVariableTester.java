package com.softycon.classes_and_objects;

import com.softycon.data_types.ScopeOfVariables;

public class ScopeOfVariableTester {
    public static void main(String[] args) {
        ScopeOfVariables sov = new ScopeOfVariables();
        System.out.println("Variable with Default Access Modifier can't be accessed outside it's parent package");
    }
}
