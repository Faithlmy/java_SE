package com.d1;



public class Nclass {
	
	public static void main(String[] args) {
//		Demo d = new Demo();
//		Demo.Bclass db = new Demo().new Bclass();
//		
//		d.fun();
//		db.f();
		
		Demo1 d1 = new Demo1();
	}
}


class Demo{
	int a = 5;
	static String b = "res";
	public void fun() {
		System.out.println("e");
	}
	class Bclass{
		void f() {
			System.out.println(a + b);
		}
	}
}

class Demo1{
	int a = 5;
	static String b = "res";
	public void fun() {
		System.out.println("e");
	}
	static class Bclass{
		static int c = 9;
		void f() {
			System.out.println(c + b);
		}
	}
}