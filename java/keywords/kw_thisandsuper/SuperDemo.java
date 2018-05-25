package kw_thisandsuper;


class country<T>{
	String name;
	Object ob;
	T t;
	void value() {
		name = "faith";
	}
	void m(String name) {
		this.name = name;
	}
	
	void y(String h) {
		name = h;
	}
	
	void z(String name) {
		name = name;
	}
	
	void x(Object ob) {
		this.ob = ob;
	}
	void w(T t) {
		this.t = t;
	}
}

public class SuperDemo extends country{

	String name;
	void value() {
		name = "shenzhen";
		System.out.println(name);
//		super.value();
//		System.out.println(super.name);
//		super.y("meng");
//		System.out.println(super.name);
		
//		super.x("meng");
//		System.out.println(super.ob);
		super.w("meng");
		System.out.println(super.t);
		
		super.x(90);
		System.out.println(super.ob);
	}
	
	public static void main(String[] args) {
		SuperDemo sd = new SuperDemo();
		sd.value();
	}
}
