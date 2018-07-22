package breakandcontinue;

public class MyContinue {

	public static void main(String[] args) {
//		System.out.println("ccc");
//		for(int i = 0; i < 7; i++) {
//			System.out.println("xx");
//			if(i == 3) {
//				System.out.println("In if next con.");
//				continue;
//			}
//			System.out.println("mmm");
//		}
		MyContinue mc = new  MyContinue();
		for(int i = 0; i < 10; i++) {
			if( i%4 != 0) continue;
			mc.fun(i);
			System.out.println(99);
		}
	}
	
	public void fun(int i) {
		System.out.println(i);
	}
}


/*

no continue is:
 ccc
xx
mmm
xx
mmm
xx
mmm
xx
In if next con.
mmm
xx
mmm
xx
mmm
xx
mmm
 * 
 */

/*
 The continue res is:
ccc
xx
mmm
xx
mmm
xx
mmm
xx
In if next con.
xx
mmm
xx
mmm
xx
mmm
 * 
 */



