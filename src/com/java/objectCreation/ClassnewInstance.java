package com.java.objectCreation;

public class ClassnewInstance {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Student stud1=Student.class.newInstance();
		
		stud1.setStudId(1);
		stud1.setStudName("Mathan");
		
		System.out.println(stud1);
	}
}
