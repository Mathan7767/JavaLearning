package com.java.accessingprivatemethod;

public class EmployeeDetails {

	private int employeeID;
	private String employeeName;
	public String id;
	static int nma;
	
	public EmployeeDetails() {
		super();
	}

	protected EmployeeDetails(String id) {
		
	}
	private EmployeeDetails(int employeeID, String employeeName) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
	}
	
	private void employeeDetails() {
		System.out.println("Private Method of Employee Invoked");
	}
	
	public void employeeName() {
		System.out.println("Employee Name Method is Invoked");
	}
	
	
}
