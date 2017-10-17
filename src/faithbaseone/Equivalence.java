package faithbaseone;

/**
 * @author faith
 *Relational operate generate a boolean
 */
public class Equivalence {
	public 	static void main(String []args) {
		int n = 2;
		int m = 2;
		System.out.println(n == m);//true
		
		int k = 5;
		n = k;
		m = k;
		System.out.println(n == m);//true
		System.out.println("===================================");
		
		Num num1 = new Num();
		Num num2 = new Num();
		num1.i = 6;
		num2.i = 6;
		System.out.println(num1.i == num2.i);//true
		System.out.println(num1.equals(num2));//false
		
		num1.i = num2.i;
		System.out.println(num1.i == num2.i);//true
		System.out.println(num1.equals(num2));//false
		
		
		Num num3 = new Num();
		num3.i = 9;
		num1.i = num3.i;
		num2.i = num3.i;
		System.out.println(num1.i);//true
		System.out.println(num2.i);//false
		System.out.println(num1.i == num2.i);//true
		System.out.println(num1.equals(num2));//false
		
		System.out.println("==========================================");
		
		String s = new String("faith");
		String s1 = new String("faith");
		String s2 = new String("faith");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		s1 = s;
		s2 = s;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("=========================================");
		
		CharTest ct1 = new CharTest();
		CharTest ct2 = new CharTest();
		ct1.c = 'A';
		ct2.c = 'A';
		System.out.println(ct1.c == ct2.c);//ture
		System.out.println(ct1 == ct2);//false
		System.out.println(ct1);//faithbaseone.CharTest@15db9742
		System.out.println(ct2);//faithbaseone.CharTest@6d06d69c
		System.out.println(ct1.c);//A
		System.out.println(ct1.equals(ct2));//false
		System.out.println("=========================================");
		CharTest ct3 = new CharTest();
		ct3.c = 'B';
		ct1.c = ct3.c;
		ct2.c = ct3.c;
		System.out.println(ct1.c == ct2.c);//ture
		System.out.println(ct1.equals(ct2));//false
		System.out.println(ct1);//faithbaseone.CharTest@15db9742
		System.out.println(ct2);//faithbaseone.CharTest@6d06d69c

	}

}
class Num{
	int i ;
}

class CharTest{
	char c;
}

