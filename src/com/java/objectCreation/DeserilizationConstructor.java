package com.java.objectCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserilizationConstructor {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		/* Serialization */
		  serialization();
		 
		/* Deserialization */
		  deserialization();
		  
		  
	}

	private static void serialization() throws FileNotFoundException, IOException {
		FileOutputStream fos=new FileOutputStream("Student.txt"); 
		ObjectOutputStream obj=new ObjectOutputStream(fos);
		  
		  Student student=new Student(); student.setStudId(5);
		  student.setStudName("Hemanth");
		  
		  obj.writeObject(student);
	}

	private static void deserialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream input = new FileInputStream("Student.txt");
		ObjectInputStream obj = new ObjectInputStream(input);

		Student student = (Student) obj.readObject();
		System.out.println(student);
	}
}
