package com.companyemployeewage;

public class CompanyEmpWage {
	
	public final String company;
    public final int empRatePerHour;
    public final int numOfWorkDays;
    public final int maxHoursMonth;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkDays, int maxHoursMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkDays = numOfWorkDays;
        this.maxHoursMonth = maxHoursMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Employee Wage for Company: " + company + " is :" + totalEmpWage;
    }

}
