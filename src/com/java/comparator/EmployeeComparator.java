package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.comparable.Employee;

/*
 * Comparator overcomes comparable interface by
 * removing the dependency on the object class.
 * 
 * When comparing logic gets changes, it can be
 * modified without impacting the Employee Class
 */
public class EmployeeComparator {
	
	public static void main(String[] args) {
		List<Employee> listOfEmployee=new ArrayList<>();
		
		listOfEmployee.add(new Employee(101,"Mathan",80,2));
		listOfEmployee.add(new Employee(102,"Arun",65,3));
		listOfEmployee.add(new Employee(103,"Kumar",93,7));
		listOfEmployee.add(new Employee(104,"Rohan",78,6));
		listOfEmployee.add(new Employee(105,"Saxena",54,1));
		
		
		Comparator<Employee> comparator=(employee1, employee2) -> {
			if(employee1.getEmployeeID()>employee2.getEmployeeID())
				return 1;
			else if(employee1.getEmployeeID()==employee2.getEmployeeID())
				return 0;
			return -1;
		};
		
		Collections.sort(listOfEmployee, comparator);
		
		listOfEmployee.forEach(
				(employeeDetail)->System.out.println(employeeDetail)
				);
	}
}
