package abstractClass;

public class Salary extends Employee{
	private double salary;
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
		
	}
	
	public void setSalary(double newSalary) {
		if(newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	
	public double getSalary() {
		return salary;
	}
	public void mailCheck() {
		System.out.println("faith mail");
	}
	
}
