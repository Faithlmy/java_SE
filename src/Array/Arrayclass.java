package Array;

import java.util.Arrays;
import java.util.Random;
import static java.lang.System.out;


import AccessControl.Paccess2;
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
		
		

		Paccess2 p1 = new Paccess2();
		p1.Pub(20);
//		Sun2 s = new Sun2();
//		
//		Hub2 h = new Hub2();
		
	}

}
