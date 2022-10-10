package com.softycon.inheritance;

public class EmployeeRecords {

    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee();
        ContractEmployee cEmp = new ContractEmployee();

        pEmp.setEmpId(101);
        pEmp.setName("Anil");
        pEmp.setBasicPay(10000);
        pEmp.setHra(1500);
        pEmp.setExperience(3);
        pEmp.calculateSalary();

        cEmp.setEmpId(102);
        cEmp.setName("Ankit");
        cEmp.setWage(500);
        cEmp.setHours(10);
        cEmp.calculateSalary();

        System.out.println("Permanent Employee: Your Salary is : " + pEmp.getSalary());
        System.out.println("Contract Employee: Your Salary is : " + cEmp.getSalary());
    }
}
