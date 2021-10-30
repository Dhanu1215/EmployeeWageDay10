package com.blp.employeewage;

public class CompanyEmpWage {
    //Declaration of Constant variables
    public final String company;
    public final int EMP_WAGE_PER_HOUR;
    public final int NUM_WORKING_DAY;
    public final int EMP_MONTHLY_WORKING_HOUR;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int emp_wage_per_hour, int num_working_day, int emp_monthly_working_hour) {
        this.company = company;
        this.EMP_WAGE_PER_HOUR = emp_wage_per_hour;
        this.NUM_WORKING_DAY = num_working_day;
        this.EMP_MONTHLY_WORKING_HOUR = emp_monthly_working_hour;
    }

    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }
    @Override
    public String toString() {
        return "Total emp wage for company: " + company + " is: " + totalEmpWage;
    }
}
