package GenericParadigm;

import java.util.ArrayList;

public class BeforeGeneric_5 {
	
	public static void main(String[] args) {
		ArrayList name = new  ArrayList();
		name.add("faith");
		name.add("hello");
		name.add(new Integer(100));
		String res = (String) name.get(0); // faith
		System.out.println(res);
		Integer i = (Integer) name.get(2);
		System.out.println(i);
		}
}
