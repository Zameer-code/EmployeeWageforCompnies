package com.companyemployeewage;

public class EmpWage {
	
	static final int PARTTIME = 1;
    static final int FULLTIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkDays;
    private final int maxHoursMonth;
    private int totalWage;

    public EmpWage(String company, int empRatePerHour, int numOfWorkDays, int maxHoursMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkDays = numOfWorkDays;
        this.maxHoursMonth = maxHoursMonth;
    }

    public void computeEmpWage() {
        //variables
        int empHours = 0;
        int totalHours = 0;
        int totalWorkingDays = 0;
        while (totalHours <= maxHoursMonth && totalWorkingDays < numOfWorkDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case FULLTIME:
                    empHours = 8;
                    break;
                case PARTTIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            totalHours += empHours;
            System.out.println("Days :" + totalWorkingDays + " Hours :" + empHours);
        }
        totalWage = totalHours * empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total Employee Wage for Company :" + company + " is :" + totalWage;
    }

    public static void main(String args[]) {
        EmpWage Dmart = new EmpWage("DMart", 20, 2, 10);
        EmpWage Reliance = new EmpWage("Reliance", 10, 4, 20);
        Dmart.computeEmpWage();
        System.out.println(Dmart);
        Reliance.computeEmpWage();
        System.out.println(Reliance);
    }

}
