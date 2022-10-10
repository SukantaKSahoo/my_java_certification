package com.softycon.static_modifier;

public class PerformanceCalculator {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setPoint(128);
        System.out.println("Performance rating for Emp 01 is : " + PerformanceRating.calculatePerformance(emp1));
    }
}
