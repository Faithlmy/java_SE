package com.d1;

public class FinalTest {
	public static void main(String[] args) {
//		Ces c = new Ces();
//		Bea b = new Bea();
		FinalStatic f1 = new FinalStatic();
		FinalStatic f2 = new FinalStatic();
		System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println(f2.i);
		System.out.println(f2.j);
		
	}
}

final class Ces{
	public int  a = 0;
	protected int b = 0;
	private int c = 0;
	Ces(){
		System.out.println("res co");
	}
	public void fun() {
		System.out.println(23);
	}
}


class Cea{
	Cea(){
		System.out.println(45);
	}
}

final class Bea extends Cea{
	Bea(){
		super();
		System.out.println(23);
	}
}

class FinalStatic{
	public final double i = Math.random();
	public static double j = Math.random();
}
