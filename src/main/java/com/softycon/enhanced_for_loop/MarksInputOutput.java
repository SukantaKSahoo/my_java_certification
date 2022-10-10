package com.softycon.enhanced_for_loop;

import java.util.Scanner;

public class MarksInputOutput {
    int[] marks = new int[5];
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    MarksInputOutput obj = new MarksInputOutput();
    obj.inputMarks();
    obj.displayMarks();

    }
    void inputMarks(){
        for(int i=0; i< marks.length; i++){
            System.out.println("Enter the mark : ");
            marks[i] = sc.nextInt();
        }
    }
    private void displayMarks() {
        for(int mark: marks)
            System.out.println(mark);
    }
}
