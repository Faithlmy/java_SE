package kw_static;

import static java.lang.System.*;
public class MyObject {

	public static int k = 5;
	private static String str1 = "staticpro";// static变量也称作静态变量，
	//静态变量和非静态变量的区别是：静态变量被所有的对象所共享，在内存中只有一个副本，
	//它当且仅当在类初次加载时会被初始化。而非静态变量是对象所拥有的，在创建对象的时候被初始化，
	//存在多个副本，各个对象拥有的副本互不影响
	private String str2 = "pro";
	
	public static String str3 = "pro"; // static不会影响变量的访问权限
	
	public MyObject() {}
	
	public void rPrint() {
		int a = 0;
		//static int b = 9;// static不允许来修饰局部变量 
		// 非静态成员方法中是可以访问静态成员方法/变量的
		out.println(str1);
		out.println(str2);
	}
	
	public static void kPrint() {
		// 在静态方法中不能访问非静态成员方法和非静态成员变量
		out.println(str1);
//		out.println(str2);
	}
	
	public static void printg(Object o){
        	System.out.println(o);
    }
	    
    public static void main(String[] args) {
    	// 使用"类名.方法名"的方式操作方法，避免了先要new出对象的繁琐和资源消耗
    	MyObject.printg(123);
    	printg(457);
    	TestStaic.printg("faith");
    	
        out.println("Hello world");
    }
}
