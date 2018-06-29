package com.serializable;

import static java.lang.System.*;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeSerializableTest {

	public static void main(String[] args)
	{
		Employee emp = null;
		try
		{
			FileInputStream fis = new FileInputStream("/root/ze.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			emp = (Employee) ois.readObject();
			ois.close();
			fis.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		emp.OutPrint();
//		out.println(emp.name);
//		out.println(emp.age);
//		out.println(emp.i);
//		out.println(emp.s);
	}
}
