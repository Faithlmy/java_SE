package faithbaseone;

/**
 * @author root
 * 
 * aliasing
 * 
 * The origin reference that was in pt1, that pointed to the object holding a value of 1,
 * was overwritten  during the assignment and effectively lost; Its object will be cleaned by
 * up the garbage collector.
 *
 */
public class Operator {
	public static void main(String []args) {
		pTest pt1 = new pTest();
		pTest pt2 = new pTest();
		
		pt1.e = 1;
		pt2.e = 2;
		System.out.println(pt1.e);//1
		System.out.println(pt2.e);//2
		
		pt1.e = pt2.e;
		System.out.println(pt1.e);//3
		System.out.println(pt2.e);//3
		
		//pt2.e = 5;
		pt1 = pt2;
		System.out.println(pt1.e);//2
		System.out.println(pt2.e);//2
		
		pt1.e = 3;
		System.out.println(pt1.e);//3
		System.out.println(pt2.e);//3
		

				
	}

}

class pTest{
	int e;
}