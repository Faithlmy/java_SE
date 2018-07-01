package Serializable2;

import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int age;
	transient String name;// 使用tranisent修饰的变量，在经过序列化和反序列化之后，JAVA对象会丢失该实例变量值
	
	public Person(int age, String name)  {
		this.age = age;
		this.name = name;
	}
}
