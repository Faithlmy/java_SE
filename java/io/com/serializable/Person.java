package com.serializable;

import java.io.Serializable;

public class Person implements Serializable{

	public String name;
	public int age;
	Person(){}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name + "====" + this.age;
	}
}
