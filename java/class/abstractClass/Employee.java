package abstractClass;
/*
 * 如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。
 * 抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。
 * 父类包含了子类集合的常见的方法，但是由于父类本身是抽象的，所以不能使用这些方法
 * 由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。也是因为这个原因，通常在设计阶段决定要不要设计抽象类.
 * 在Java中抽象类表示的是一种继承关系，一个类只能继承一个抽象类，而一个类却可以实现多个接口
 * */

public abstract class Employee {
	private String name;
	private String address;
	private int number;
	
	public Employee (String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public double computePay(){
		System.out.println("faith: ");
		return 0.0;
	}
	
	public void mailChack() {
		System.out.println("this mail to: " + this.name + this.address);
	}
	public String toString() {
		return name + "" + address + "" + number;
	}
	
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
}
