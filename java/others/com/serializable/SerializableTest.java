package com.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args)
	{
		Employee emp = new Employee();
		emp.name = "faith";
		emp.age = 9;
		emp.s = "kill";
		emp.i = 9090;
		
		try 
		{
			FileOutputStream fileout = new FileOutputStream("/root/ze.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fileout);
			oos.writeObject(emp);
			oos.close();
			fileout.close();
			System.out.println("Serialized data is saved in /root/ze.txt");
			emp.OutPrint();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
