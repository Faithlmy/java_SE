package kw_static;

import static java.lang.System.*;
public class MyObject {

	private static String str1 = "staticpro";
	private String str2 = "pro";
	
	public MyObject() {}
	
	public void rPrint() {
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
