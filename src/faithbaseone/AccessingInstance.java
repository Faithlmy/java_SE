package faithbaseone;

/**
 * @author faith
 * 
 * Accessing Instance Variables and Methods
 *
 */
public class AccessingInstance {
	
	int myage;
	
	public AccessingInstance(String name) {
		// This constrnctor has one parameter, name
		System.out.println("construtors: " + name);
	}
	public void setAge( int age) {
		myage = age;
	}
	
	public int getAge() {
		System.out.println("Setting age is : " + myage);
		return myage;
	}
	public void TwoAge() {
		System.out.println("TwoAge is : " + myage);
	}
	
	public static void main(String []args) {
		AccessingInstance AI = new AccessingInstance("faith");
		AI.setAge(9);
		AI.getAge();
		AI.TwoAge();
		System.out.println("variable value is : " + AI.myage);
	}

}
