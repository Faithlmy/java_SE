package com.d1;

public class ClassConnection extends Faith {
	
	ClassConnection(){
		super();
		System.out.println(100);
	}
	
	public static void main(String[] args) {
		System.out.println("co");
		new ClassConnection();
	}
}
class Faith extends Faiths{
	public Faith() {
		super.fun();
		System.out.println(23);
	}

	public void funx() {
		System.out.println(2);
	}
}

class Faiths{
	Faiths(){
		System.out.println("78");
	}
	Faiths(int i){
		System.out.println(i);
	}
	public void fun() {
		System.out.println("fs1");
	}
}