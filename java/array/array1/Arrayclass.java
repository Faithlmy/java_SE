package array1;

import java.util.Arrays;
import java.util.Random;
import static java.lang.System.out;


import AccessControl.Package;


/**
 * @author root
 *
 */
public class Arrayclass {
	public static void main(String []args) {
		Random rd = new Random();
		Integer[] a = new Integer[rd.nextInt(100)];
		out.println("a.langth = " + a.length);
		for(int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(5);
		}
		out.println(Arrays.toString(a));
		Package p = new Package();
		p.P();
		
	
//		Sun2 s = new Sun2();
//		
//		Hub2 h = new Hub2();
		
	}

}
