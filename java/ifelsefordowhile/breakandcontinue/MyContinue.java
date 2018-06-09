package breakandcontinue;

public class MyContinue {

	public static void main(String[] args) {
		System.out.println("ccc");
		for(int i = 0; i < 7; i++) {
			System.out.println("xx");
			if(i == 3) {
				System.out.println("In if next con.");
				continue;
			}
			System.out.println("mmm");
		}
	}
}
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