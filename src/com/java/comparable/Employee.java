package com.java.comparable;

public class Employee implements Comparable<Employee>{

	private int employeeID;
	private String employeeName;
	private double employeeSalary;
	private int employeeExperience;
	
	public Employee(int employeeID, String employeeName, double employeeSalary, int employeeExperience) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeExperience = employeeExperience;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeExperience() {
		return employeeExperience;
	}

	public void setEmployeeExperience(int employeeExperience) {
		this.employeeExperience = employeeExperience;
	}

	@Override
	public String toString() {
		return "employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeExperience=" + employeeExperience ;
	}

	@Override
	public int compareTo(Employee employee) {
		
		if(this.getEmployeeExperience()>employee.getEmployeeExperience())
			return 1;
		else if(this.getEmployeeExperience()==employee.getEmployeeExperience())
			return 0;

		return -1;
	}
}
