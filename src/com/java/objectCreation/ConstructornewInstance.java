package com.java.objectCreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructornewInstance {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Constructor<Student> con = Student.class.getConstructor(int.class, String.class);

		Student student = con.newInstance(2, "Mohan");

		System.out.println(student);
		
	}
}
