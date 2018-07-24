package com.d1;

public class StaticInitialization {

	public static void main(String[] args) {
		System.out.println("+++++++");
		 new Cupboard();
		System.out.println("----------");
		 new Cupboard();
		 System.out.println("************");
		 t2.f2(1);
		 t3.f3(1);
	}
	
	static Table t2 = new Table();
	static Cupboard t3 = new Cupboard();
}

class Bowl {
	  Bowl(int marker) {
	    System.out.println("Bowl(" + marker + ")");
	  }
	  void f(int marker) {
	    System.out.println("f(" + marker + ")");
	  }
}

class Table {
	  static Bowl b1 = new Bowl(1);
	  Table() {
	    System.out.println("Table()");
	    b2.f(1);
	  }
	  void f2(int marker) {
	    System.out.println("f2(" + marker + ")");
	  }
	  static Bowl b2 = new Bowl(2); // ע�� b2.f(1)��ǰ
}


class Cupboard {
	  Bowl b3 = new Bowl(3);
	  static Bowl b4 = new Bowl(4); // b4.f(2) �ں�
	  Cupboard() {
	    System.out.println("Cupboard()");
	    b4.f(2);
	  }
	  void f3(int marker) {
		  System.out.println("f3(" + marker + ")");
		  }
	  static Bowl b5 = new Bowl(5);
}

