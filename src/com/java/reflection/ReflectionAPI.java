package com.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*Reflection API is used to modify or 
	examine the behavior of an object during runtime*/

public class ReflectionAPI {

	public static void main(String[] args) {

		EmployeeDetails employee=new EmployeeDetails();
		
		//Creating the class Object for employee
		Class cls=employee.getClass();
		
		System.out.println("Name of the class:"+cls.getSimpleName());
		
		Constructor[] constructors=cls.getConstructors();
		
		System.out.println("The Name of constructors are:");
		for(Constructor c:constructors) {
			System.out.println(c.getName() +" and its Parameter Count:"+c.getParameterCount());
		}
		
		System.out.println("The Public method of class are:");
		Method[] methods=cls.getMethods();
		
		for(Method method:methods) {
			System.out.print(method.getName()+" ,");
		}
		System.out.println();
		
		//Invoke the Method during runtime
		try {
			Method methodCall=cls.getDeclaredMethod("displayNumber", int.class);
			methodCall.invoke(employee, 1);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
