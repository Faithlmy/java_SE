package GenericExe.java;

public class GenericTest {
	
	public static void main(String[] args) {
		GenericArrylist<Object> ga = new GenericArrylist<Object>();
		ga.add(1);
		ga.add(2);
		GenericArrylist<Person> gn = new GenericArrylist<Person>();
		gn.add(new Person("faith"));
		gn.add(new Person("jingji"));
		GenericTest.add(gn, ga);
		Gamain.print(ga);
	}


	public static <T> void add(GenericArrylist<T> list1, GenericArrylist<? super T> list2) {
		for(int i = 0; i < list1.size(); i++) {
			list2.add(list1.get(i));
		}
	}

}
