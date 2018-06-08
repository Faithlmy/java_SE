package kw_static;

public class TestStaic {

	public static void main(String[] args) {
		MyStaticOne ms1 = new MyStaticOne();
		MyStaticOne ms2 = new MyStaticOne();
		
		System.out.println(ms1.p++);//89
		System.out.println(ms2.p);//90
		System.out.println("==========================================");
		
		MyStaticTwo mt1 = new MyStaticTwo();
		MyStaticTwo mt2 = new MyStaticTwo();
		System.out.println(mt1.k++);//100
		System.out.println(mt2.k);//100
		System.out.println("===========================================");
	}
}

class MyStaticOne{
	static int p = 89;
}

class MyStaticTwo{
	int k = 100;
}