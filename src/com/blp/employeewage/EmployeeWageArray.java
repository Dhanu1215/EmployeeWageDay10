package com.blp.employeewage;

/**
 * Compute  total employee wage for each company
 */
public class EmployeeWageArray {
    //Declaration of Constant variables
    public static final int EMP_FULL_TIME_HOUR = 1;
    public static final int EMP_PART_TIME_HOUR = 2;
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWagesArray;

    public EmployeeWageArray() {
        companyEmpWagesArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int emp_wage_per_hour, int num_working_day, int emp_monthly_working_hour) {
        companyEmpWagesArray[numOfCompany] = new CompanyEmpWage (company, emp_wage_per_hour, num_working_day, emp_monthly_working_hour);
    }

    private void computeEmpWage() {
        for (int i = 0; i <= numOfCompany; i++) {
            companyEmpWagesArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWagesArray[i]));
            System.out.println(companyEmpWagesArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        //Declaration of variables
        int empHours;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        //Use random function to check employee is present or absent
        while (totalEmpHrs <= companyEmpWage.EMP_MONTHLY_WORKING_HOUR && totalWorkingDays < companyEmpWage.NUM_WORKING_DAY) {
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
        return totalEmpHrs * companyEmpWage.EMP_WAGE_PER_HOUR;
    }

    public static void main(String[] args) {
        EmployeeWageArray empWage = new EmployeeWageArray();
        empWage.addCompanyEmpWage("De-mart", 20, 2, 10);
        empWage.computeEmpWage();
        empWage.addCompanyEmpWage("Reliance", 10, 4, 20);
        empWage.computeEmpWage();
    }
}

