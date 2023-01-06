package com.java.reflection;

public class EmployeeDetails {

	int empID;
	String empName;
	int empWorkCode;
	int empPhoneNumber;
	double empSalary;
	String empAddress;
	
	
	public EmployeeDetails(int empID, String empName, int empWorkCode, int empPhoneNumber, double empSalary,
			String empAddress) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empWorkCode = empWorkCode;
		this.empPhoneNumber = empPhoneNumber;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
	public EmployeeDetails() {
		super();
		this.empID = 0;
		this.empName = "";
		this.empWorkCode = 4016;
		this.empPhoneNumber = 1234567;
		this.empSalary = 0;
		this.empAddress = "Tamil Nadu";
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpWorkCode() {
		return empWorkCode;
	}
	public void setEmpWorkCode(int empWorkCode) {
		this.empWorkCode = empWorkCode;
	}
	public int getEmpPhoneNumber() {
		return empPhoneNumber;
	}
	public void setEmpPhoneNumber(int empPhoneNumber) {
		this.empPhoneNumber = empPhoneNumber;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String toString() {
		return "EmployeeDetails [empID=" + empID + ", empName=" + empName + ", empWorkCode=" + empWorkCode
				+ ", empPhoneNumber=" + empPhoneNumber + ", empSalary=" + empSalary + ", empAddress=" + empAddress
				+ "]";
	}
	public void displayNumber(int a) {
		System.out.println("Input Number is:"+a);
	}
	
	private void privateMethod() {
		System.out.println("Private Method Invoked");
	}
	
}
