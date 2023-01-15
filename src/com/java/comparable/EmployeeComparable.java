package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*	
 	Comparable interface can be used  
	when Employee class can implementing it.
	
	Employee details can be sorted only
	using his experience until and unless 
	we modify compareTo() method 
*/
public class EmployeeComparable {

	public static void main(String[] args) {
		
		List<Employee> listOfEmployee=new ArrayList<>();
		
		listOfEmployee.add(new Employee(101,"Mathan",80,2));
		listOfEmployee.add(new Employee(102,"Arun",65,3));
		listOfEmployee.add(new Employee(103,"Kumar",93,7));
		listOfEmployee.add(new Employee(104,"Rohan",78,6));
		listOfEmployee.add(new Employee(105,"Saxena",54,1));

		
		Collections.sort(listOfEmployee);

		listOfEmployee.forEach(
				(employee)->System.out.println(employee)
				);
	}
}
