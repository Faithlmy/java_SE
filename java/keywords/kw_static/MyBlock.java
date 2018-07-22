package kw_static;

public class MyBlock {

	public static void main(String[] args) {
		
		MyObject.kPrint(); //不需要new就可以调用MyObject中的static方法
		MyObject.printg(23);
		String res = MyObject.str3;
		System.out.println(MyObject.k);
		MyBlock mb = new MyBlock();
		mb.call();
		mb.call2();
		System.out.println(MyObject.k);
		
	}
	
	public void call() {
		MyObject mo = new MyObject();
		mo.k++;
		mo.kPrint();// 相反，如果用new的方法去调用static方法，编译器将会发出警告
	}
	public void call2() {
		System.out.println(MyObject.k);
	}
}
