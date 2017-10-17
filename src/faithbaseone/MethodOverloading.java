package faithbaseone;

/**
 * @author faith
 * 
 * Mehtod Overloading
 * 1. The same word expresses a number of different meanings -- it is overloading.
 * 2. method overloading is essential to allow the same method name to be used with different 
 *    argument types.
 *    
 * 3. Each overloaded method must take a unique list of argument types.
 * 
 *
 */
public class MethodOverloading {
	public static void main(String []args) {
		Tree tree = new Tree();
		Tree tree2 = new Tree(9);
		tree.Info();
		tree.Info(8);
		tree.Info(3, 9);
	}
}
class Tree{
	int i;
	
	Tree(){//constructor
		System.out.println("faith");
	}
	Tree(int t){
		i = t;
		System.out.println(i);
	}
	
	void Info(){//ordinary
		System.out.println("Info");
	}
	void Info( int info){
		i = info;
		System.out.println(i);
	}
	void Info(int a, int b) {
		System.out.println(a + b);
	}
}