package Inheritance1;

public class Husband extends Person1 {
	public static void main(String []args) {
		Husband hb = new Husband();
	}
	
	Husband(){
		super();//If Persion1.java has a private constructor of Persion1,there will error that the constructor Person1() is not visible
		System.out.print("Husband default constuctor");
	}

}
