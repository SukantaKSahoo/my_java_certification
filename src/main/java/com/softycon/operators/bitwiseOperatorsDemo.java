package com.softycon.operators;

public class bitwiseOperatorsDemo {

    public static void main(String[] args) {
        int a=0,b=1,c=2;
        System.out.println("a = " + a + ", b = " + b + " & c = " + c);
        System.out.println("a & b = " + (a&b));
        System.out.println("a | b = " + (a|b));
        /*
        * Bitwise XOR (exclusive or) "^" is an operator in Java
        * that provides the answer '1' if both of the bits in its operands are different,
        * if both of the bits are same then the XOR operator gives the result '0'*/
        System.out.println("a ^ b = " + (a^b));
        System.out.println("a ^ a = " + (a^a));
        System.out.println("b ^ b = " + (b^b));
        System.out.println("\n================= SHIFT OPERATOR IN JAVA ==================\n");
        byte x = 64, y;
        int i;
        y = (byte)(x << 2);
        System.out.println("Original value of x : " + x);
        System.out.println("i = x << 2 : " + (x << 2));
    }
}
