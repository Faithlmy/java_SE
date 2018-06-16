package Inheritance3;

import static java.lang.System.*;
public class Music {

}

abstract class Animal{
	String name;
	int age;
	
	public abstract void cry() ;
	public abstract void fly();
	public void run() {
		out.println("run");
	}
}

class cat extends Animal{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		out.println("cat extends Animal.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}