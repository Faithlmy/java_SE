package ThisPackage;

/**
 * @author root
 * <--- the key words of this --->
 * 
 * 1. The this keyword—which can be used only inside a non-static method—produces 
 *    the reference to the object that the method has been called for.
 */

import static java.lang.System.out;


public class BananaPeel {
	public static void main(String []args) {
		Banana ba = new Banana(),
			   bb = new Banana();
		ba.peel(1);
		bb.peel(2);
		//ba.FunPeel();
		out.println("ba "+ ba.FunPeel());
		bb.FunPeel();
		bb.FunPeel();
		out.println(bb.FunPeel());
		out.println("==========");
		
		Flower f = new Flower();
		//out.println("========");
		//Flower fnum = new Flower(300);
		//Flower fstring = new Flower("faith");
		
		
	}

}

class Banana{
	int i = 0;
	void peel(int i) {
		System.out.println(i);
	}
	public int FunPeel() {
		i++;
		return this.i;
		//return i;
	}
}