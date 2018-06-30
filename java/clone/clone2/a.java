package clone2;

import java.util.ArrayList;
import java.util.List;

public class a{

	public static void main(String[] args) {
		
	}
}

class m{
	public static void main(List<String> args) {
		for(int i = 0; i < args.size(); i++) {
			System.out.println(args.get(i));
		}
		
		new m();
	}
	m(){
		System.out.println(90);
	}
	static {
		System.out.println(12);
	}
}

class k extends m{
	k(){
		System.out.println(67);
	}
	public static void main(String[] args) {
//		String[] az = {"q", "b"};
		List<String> az = new ArrayList<String>();
		az.add("a");
		m mm = new m();
		mm.main(az);
	}
	static {
		System.out.println(123);
	}
}