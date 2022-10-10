package com.softycon.conditional_statements;

public class DoWhileReverseCalculator {
    public static void main(String[] args) {
        int num = 1207, revNum = 0;
        do{
            revNum = (revNum+(num % 10)) * 10;
            num /= 10;
        }while(num>10);
        revNum += num;
        System.out.println("Reverse Number is : " + revNum);
    }
}
