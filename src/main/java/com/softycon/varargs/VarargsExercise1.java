package com.softycon.varargs;

import java.util.Arrays;
import java.util.OptionalInt;

public class VarargsExercise1 {
    public static void main(String[] args) {
        VarargsExercise1 var = new VarargsExercise1();
        var.displayList(2,3,4,5);
        var.maxOfList(2,3,4,5);
        var.averageList(1,2,3,4,5);
    }
    void displayList (int... input){
        for(int x:input){
            System.out.println(x);
        }
    }
    void maxOfList (int... input){
        OptionalInt max = Arrays.stream(input).max();
        System.out.println("Max number in the Array is : " + max.getAsInt());
    }
    void sortList (int... input){

    }
    void averageList (int... input){
        double avg, sum=0;
        for (int x: input){
            sum+=x;
        }
        avg = sum/input.length;
        System.out.println("Average of the numbers in the Array is : " + avg);
    }
}
