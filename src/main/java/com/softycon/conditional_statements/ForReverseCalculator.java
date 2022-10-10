package com.softycon.conditional_statements;

public class ForReverseCalculator {
    public static void main(String[] args) {
        int num=265772, revNum = 0;
        for (;num>10;num/=10)
            revNum = (revNum+(num%10)) * 10;
            revNum += num;
            System.out.println("Reverse Number is : " + revNum);

    }
}

