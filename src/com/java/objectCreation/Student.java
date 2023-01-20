package com.java.objectCreation;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	private int studId;
	private String studName;
	
	Student(){
		System.out.println("Constructor Called");
	}
	
	
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}


	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}
	
}
