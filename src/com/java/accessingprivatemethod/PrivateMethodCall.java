package com.java.accessingprivatemethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class PrivateMethodCall {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> c=Class.forName("com.java.accessingprivatemethod.EmployeeDetails");
		
		Object obj=c.newInstance();
		try {
			invokePrivateMethod(c,obj);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		Field[] f=c.getDeclaredFields();
		

		for(Field f1:f)
			System.out.println(f1.getModifiers() + " "+f1.getName());
	}
	
	public static void invokePrivateMethod(Class<?> c,Object obj) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Method m=c.getDeclaredMethod("employeeDetails", null);
		
		/*set the accessibility of private method*/
		m.setAccessible(true);
		
		m.invoke(obj, null);
		
	}
}
