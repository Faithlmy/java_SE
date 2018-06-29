package com.serializable;

import java.io.Serializable;
public class Employee2 implements Serializable
{
	private static final long serialVersionUID = 2L;
	public String name;
	public int age;
	public transient int i = 123;
	public transient String s ;
	public void OutPrint()
	{
		System.out.println(name + " | " + age + " | " + s + " | " + i);
	}
}
