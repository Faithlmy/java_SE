package kw_static;

//如下代码输出的结果：
public class OrderStatic2 extends test{

	static {
		System.out.println("OrderStatic2 static");
	}
	public static void main(String[] args) {
		
	}
}
class test{
	static {
		System.out.println("test static");
	}
}