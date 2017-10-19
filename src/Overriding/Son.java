package Overriding;

public class Son extends Father {
	//@Override
	public void num(int a, int b) {
		super.num(5, 2);//overriding
		//System.out.println("son = " + (a - b));
	}
	
	public static void main(String []args) {
		Son s = new Son();
		s.Sprint();
		s.num(5, 2);
		
		
		Father f = new Father();
		f.num(4, 6);//invoking directly
		
	}
}
