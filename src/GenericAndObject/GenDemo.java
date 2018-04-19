package GenericAndObject;

public class GenDemo {

	public static void main(String[] args) {
//		@SuppressWarnings("unused")
		Gen<String> g = new Gen<String>("faith");
		String res;
		res = g.getOb();
		System.out.println(res);
		g.showType();  // java.lang.String
		
		System.out.println();
		
		Gen<Integer> gi = new Gen<Integer>(123);
		Integer resGi;
		resGi = gi.getOb();
		System.out.println(resGi);
		gi.showType(); // java.lang.Integer
		
		
		System.out.println("GenFaith");
		GenFaith gf = new GenFaith<String>("dream");
		System.out.println(gf.getFaith());
		gf.showType();
	}
}
