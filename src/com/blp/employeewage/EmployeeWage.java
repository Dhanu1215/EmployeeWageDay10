package com.blp.employeewage;

/**
 * Compute  total employee wage for each company
 */
public class EmployeeWage {

    //Declaration of Constant variables
    public static final int EMP_FULL_TIME_HOUR = 1;
    public static final int EMP_PART_TIME_HOUR = 2;
    private final String company;
    private final int EMP_WAGE_PER_HOUR;
    private final int NUM_WORKING_DAY;
    private final int EMP_MONTHLY_WORKING_HOUR;
    private int totalEmpWage;

    public EmployeeWage(String company, int emp_wage_per_hour, int num_working_day, int emp_monthly_working_hour) {
        this.company = company;
        EMP_WAGE_PER_HOUR = emp_wage_per_hour;
        NUM_WORKING_DAY = num_working_day;
        EMP_MONTHLY_WORKING_HOUR = emp_monthly_working_hour;
    }

    public static void main(String[] args) {
        EmployeeWage dMart = new EmployeeWage("De-mart", 20, 2, 10);
        EmployeeWage reliance = new EmployeeWage("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }

    private void computeEmpWage() {
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
        totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HOUR;
    }

    @Override
    public String toString() {
        return "Total emp wage for company: " + company + " is: " + totalEmpWage;
    }
}

