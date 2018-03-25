package Inheritance;

public class Son1 extends Person2 {
	public static void main(String []args) {
		Son1 s = new Son1();
		s.FunPerson2();
	}
	
	Son1(){
		//super();
		System.out.println("Son1");
	}
}
