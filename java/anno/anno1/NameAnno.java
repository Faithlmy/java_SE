package anno1;

import anno1.UserCase.MyName;

public class NameAnno {
	public static void main(String[] args) {
		NameAnno na = new  NameAnno();
		na.fun();
	}

	@MyName(name = "faith")
	public void fun() {
		System.out.println("hp");
	}
}
