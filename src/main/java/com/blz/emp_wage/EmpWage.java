package com.blz.emp_wage;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation");

        int emp_present = 1;
        int wage_per_hr = 20;
        int full_day_hr = 8;
        int part_time_hr = 8;

        double emp_check = Math.floor(Math.random() * 10) % 2;
        if (emp_check == emp_present) {
            System.out.println("employee is present");
            //calculating daily wage including part time hour
            int daily_wage = wage_per_hr * full_day_hr + wage_per_hr * part_time_hr;
            System.out.println("daily wage of employee " + daily_wage);
        }

        else {
            System.out.println("employee is absent");
        }
    }
}
