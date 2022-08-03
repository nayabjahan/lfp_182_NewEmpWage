package com.blz.emp_wage;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation");
        int emp_present = 1;
        double emp_check = Math.floor(Math.random() * 10) % 2;
        if (emp_check == emp_present) {
            System.out.println("employee is present");
        }
        else {
            System.out.println("employee is absent");
        }
    }
}
