package faithbaseone;

/*******************Constructors******************/
/*
 * Constructors:
 * 1. Characteristic
 * 		1) Constructors should have the same name as class.
 *      2) Constructors have not return a value
 * 		3) At least one constructor will be invoked.(If you do not declare constructor, 
 * 			the JVM will automatically creates a default constructor for your class.
 *          All of default constructor is static.)
 * 		4) A class have more than one constructors.
 * 		5) No parameter or at least one parameter will be included Constructors 
 * 		
 * 2. Creating an object（Note: This is essential 3 step）
 * 		1) Declaration
 * 		2) Instantiation
 * 		3) Initialization
 * */

public class ConstuctorsTest {
	public ConstuctorsTest() {
		// No parameter
		System.out.println("No parameter");
	}
	public ConstuctorsTest( String name) {
		//This constuctor has one parameter, name
		System.out.println(name);
	}
	
	public static void main(String arg[]) {
		//Create an object Testjava
		ConstuctorsTest t_one = new ConstuctorsTest("one parameter");
		ConstuctorsTest t_no = new ConstuctorsTest();
	}

}