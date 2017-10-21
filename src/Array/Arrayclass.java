package Array;

import java.util.Arrays;
import java.util.Random;
import static java.lang.System.out;
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
		
		
	}

}
