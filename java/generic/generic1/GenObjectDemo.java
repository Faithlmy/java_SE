package generic1;

public class GenObjectDemo {
	public static void main(String[] args) {
		GenObject gen1 = new GenObject("dream");
//		GenObject gen = new GenObject(new String ("dream"));
//		Object k = gen1.getOb();
		Object k = gen1.getOb();
		System.out.println(k);
		gen1.showType();
		
		GenObject gen2 = new GenObject(34);
		System.out.println(gen2.getOb());
		gen2.showType();
	}
	

}
