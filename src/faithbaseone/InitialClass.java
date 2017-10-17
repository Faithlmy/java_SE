package faithbaseone;

/**
 * @author faith
 * class:
 * 1. In the entire file of ending with .java, the public class appears only once.
 * 2. The name of class must be the same as the name of document.
 * 3. The base of datetype such as int,short, it will be default zero.(boolean will be default false).
 * 4. The reference variable will be default null.
 * 5. The classes of java is loaded when it be only needed, and it is loaded only once.
 *
 */

// static is loaded only once 
public class InitialClass {
	public static void main(String []args) {
		Bread b1 = new Bread();
		Bread b2 = new Bread();
		Bread b3 = new Bread();
		//b3.num(10);
		System.out.println(b3.a);//if you do not open b3.num(10),this result is 0.
		System.out.println(b3.b);// Return null
	}

}

class Bread{
	int a;
	String b;
	static {
		System.out.println("Bread is loaded");
	}
	static {
		System.out.println("static2");
	}
	public Bread() {//this is a constructor
		System.out.println("Bread");
	}
	public int num(int a) {
		this.a = a;
		return a;
	}
}
