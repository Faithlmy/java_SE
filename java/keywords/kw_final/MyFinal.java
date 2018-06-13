package kw_final;

import static java.lang.System.*;
public class MyFinal  {
//	man m = new man();
	public static void main(String[] args) {
		  // final变量和普通变量的区别
	      String a = "hello2"; 
	      final String b = "hello";
	      String d = "hello";
	      String c = b + 2; 
	      String e = d + 2;
	      out.println(c); // hello2
	      out.println(e); // hello2
	      
	      System.out.println((a == c)); // true
	      System.out.println((a == e)); // false
	      out.println("=================================");
	      
	      //引用变量被final修饰之后，虽然不能再指向其他对象，但是它指向的对象的内容是可变的
	      String aa = "hello2";
	      final String bb = getHello();
	      String cc = bb + 2;
	      out.println(aa == cc); // false
	}
	
	 public static String getHello() {
	        return "hello";
	    }
	
}

//1. 当用final修饰一个类时，表明这个类不能被继承
final class people{
	public people() {}
} 
//2. final修饰方法的原因有两个。第一个原因是把方法锁定，以防任何继承类修改它的含义；
//第二个原因是效率。在早期的Java实现版本中，会将final方法转为内嵌调用。但是如果方法过于庞大，
//可能看不到内嵌调用带来的任何性能提升。在最近的Java版本中，不需要使用final方法进行这些优化了。
//因此，如果只有在想明确禁止 该方法在子类中被覆盖的情况下才将方法设置为final的.
// 类的private方法会隐式地被指定为final方法

class man{
	final int a = 3;
	public man() {
//		i  = 5;
		final Object ob = new Object();
//		ob = new Object();
	}
}