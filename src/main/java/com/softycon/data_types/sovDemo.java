package com.softycon.data_types;

class sovDemo {
    int i = 34;   // instance variable
    static int z; // class variable
    static {
        z = 10;
        System.out.println("inside static block: " + z);
    }
    void test() {
        int k = 200;  // local variable
        System.out.println("local variable: " + (k + i));
    }
    public static void main(String[] args) {
        sovDemo obj = new sovDemo();
        obj.test();
        System.out.println(obj.i);
    }
}

