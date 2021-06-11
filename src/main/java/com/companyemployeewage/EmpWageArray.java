package com.companyemployeewage;

import java.util.ArrayList;

public class EmpWageArray implements ComputeEmpWage {
	
	 public static final int PARTTIME = 1;
	    public static final int FULLTIME = 2;

	    private int numOfCompany = 0;
	    private ArrayList<CompanyEmpWage> companyEmpWageArrayList;

	    public EmpWageArray() {
	        companyEmpWageArrayList = new ArrayList<>();
	    }

	    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkDays, int maxHoursMonth) {
	        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkDays, maxHoursMonth);
	        companyEmpWageArrayList.add(companyEmpWage);
	    }

	    public void computeEmpWage() {
	        for (int i = 0; i < companyEmpWageArrayList.size(); i++) {
	            CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
	            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
	            System.out.println(companyEmpWage);
	        }
	    }

	    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
	        //variables
	        int empHours = 0;
	        int totalHours = 0;
	        int totalWorkingDays = 0;
	        while (totalHours <= companyEmpWage.maxHoursMonth && totalWorkingDays < companyEmpWage.numOfWorkDays) {
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
	            System.out.println("Day :" + totalWorkingDays + " Hours :" + empHours + " Daily Employee Wage :" + (empHours * companyEmpWage.empRatePerHour));
	        }
	        return totalHours * companyEmpWage.empRatePerHour;
	    }

	    public static void main(String args[]) {
	        EmpWageArray obj = new EmpWageArray();
	        obj.addCompanyEmpWage("Dmart", 20, 2, 10);
	        obj.addCompanyEmpWage("Reliance", 10, 4, 20);
	        obj.computeEmpWage();
	    }
}
