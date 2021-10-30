package com.blp.employeewage;

public class EmployeeWage {

    //Declaration of Constant variables
    public static final int EMP_FULL_TIME_HOUR = 1;
    public static final int EMP_PART_TIME_HOUR = 2;

    public static void main(String[] args) {
        computeEmpWage("De-mart", 20, 2, 10);
        computeEmpWage("Reliance", 10, 4, 20);
    }

    private static int computeEmpWage(String company, int EMP_WAGE_PER_HOUR, int NUM_WORKING_DAY, int EMP_MONTHLY_WORKING_HOUR) {
        //Declaration of variables
        int empHours;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        //Use random function to check employee is present or absent
        while (totalEmpHrs <= EMP_MONTHLY_WORKING_HOUR && totalWorkingDays < NUM_WORKING_DAY) {
            totalWorkingDays++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case EMP_FULL_TIME_HOUR:
                    empHours = 8;
                    System.out.println("Employee is present for full time");
                    break;
                case EMP_PART_TIME_HOUR:
                    empHours = 4;
                    System.out.println("Employee is present for half time");
                    break;
                default:
                    empHours = 0;
                    System.out.println("Employee is absent");
            }
            totalEmpHrs += empHours;
            System.out.println("Day:" + totalWorkingDays + " " + "Emp Hr:" + empHours);
        }
        int totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HOUR;
        System.out.println("Total Emp Wage For Company  = " + company + " is: " + totalEmpWage);
        return (totalEmpWage);
    }
}
