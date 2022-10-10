package com.softycon.conditional_statements;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        int choice, input;
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("Enter the Input Number : ");
                input = sc.nextInt();
                int temp = input;
                int i;
                for (i = 0; input>0; i++){
                    input /= 10;
                }
                System.out.println("The input number is a " + i + " digit number");
                int sum = 0;
                if(i%2 == 0) {
                    while (temp >= 10) {
                        sum += (temp % 10) * (temp % 10);
                        System.out.println("Sum is : " + sum);
                        temp /= 100;
                    }
                }
                else {
                    while (temp >= 10) {
                        sum += ((temp / 10) % 10) * ((temp / 10) % 10);
                        System.out.println("Sum is : " + sum);
                        temp /= 100;
                    }
                }
                if(sum%9 == 0) {
                    System.out.println("The number is a Lucky Number");
                }
                else {
                    System.out.println("The number is not a Lucky Number");
                }
                break;
            case 2 :
                System.out.println("Choice is 2");
                break;
            default :
                System.out.println("Wrong Choice");
        }

    }
}
