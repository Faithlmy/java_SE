package kw_static;

public class ThisStatic {

	static int a = 9;
	public void fun() {
		int a = 3;
		System.out.println("in_a " + a);
		System.out.println("static_a " + this.a);
	}
	public static void main(String[] args) {
//		ThisStatic ts = new ThisStatic();
//		ts.fun();
		new ThisStatic().fun();
	}
}
