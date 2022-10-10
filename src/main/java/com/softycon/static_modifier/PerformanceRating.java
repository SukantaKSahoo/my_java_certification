package com.softycon.static_modifier;

public class PerformanceRating {

    private final static int Outstanding=5, Good=4, Average=3, Poor=2;

    static int calculatePerformance (Employee employee){
        int point = employee.getPoint();
        if(point>=80 && point<=100){
            return 5;
        } else if (point>=60 && point<80) {
            return 4;
        } else if (point>=50 && point<60) {
            return 3;
        } else if (point>=1 && point<50) {
            return 2;
        } else {
            System.out.println("Invalid Points");
            return 0;
        }
    }
}
