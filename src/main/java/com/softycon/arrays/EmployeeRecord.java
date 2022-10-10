package com.softycon.arrays;

public class EmployeeRecord {
	// Author : Softycon
    public static void main(String[] args) {

        double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        double avgSalary = 0;
        int aboveAvg=0, belowAvg=0, equalAvg=0, i;
        for (i=0;i<salary.length;i++){
            avgSalary += salary[i];
        }
        avgSalary /= salary.length;
        System.out.println("The average Salary of the employee is : " + avgSalary);

        for (i=0;i<salary.length;i++){
           if(avgSalary<salary[i])
               aboveAvg++;
           else if (avgSalary>salary[i])
               belowAvg++;
           else
               equalAvg++;
        }
        System.out.println("The number of employees having salary greater than the average is : " + aboveAvg);
        System.out.println("The number of employees having salary less than the average is : " + belowAvg);
    }
}
