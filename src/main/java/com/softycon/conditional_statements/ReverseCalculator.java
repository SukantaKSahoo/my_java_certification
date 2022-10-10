package com.softycon.conditional_statements;

public class ReverseCalculator {
    public static void main(String[] args) {
        int num = 70, revNum=0;
        while(num > 10){
            revNum = (revNum+(num%10)) * 10;
            num /= 10;
        }
        revNum += num;
        System.out.println("The reverse number is : " + revNum);
    }
}
