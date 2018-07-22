package kw_static;


// 如下代码输出的结果：
public class OrderStatic1 extends Base{
	static {
		System.out.println("order static");
	}
	public OrderStatic1() {
		System.out.println("order custructor");
	}
	
	public static void main(String[] args) {
		new OrderStatic1();
	}
}

class Base{
	static{
		System.out.println("base static");
	}
	public Base() {
		System.out.println("base custructor");
	}
}