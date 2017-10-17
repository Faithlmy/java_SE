package faithbaseone;



/**
 * @author faith
 *  Access Control Modifiers: public protected default private
 */
public class AccessControlModifiers {
	
	public String name;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	public void prinfIt() {
//		System.out.println("name  " + name);
//		System.out.println("salary  " + salary);
//	}
	
	public static void main(String []args) {
		AccessControlModifiers acm = new AccessControlModifiers();
		acm.setSalary(100);
		acm.setName("faith");
//		acm.prinfIt();
		System.out.println(acm.getSalary());
	}
}
