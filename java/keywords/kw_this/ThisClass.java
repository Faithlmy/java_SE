package kw_this;

public class ThisClass {

	public static void main(String[] args) {
//		new Faith(9);
//		new Faith("k");
		new Faith("2", 8);
		
	}
}

class Faith{
	int i = 5;
	public Faith() {
		System.out.println("NO paramas constructor.");
	}
	public Faith(String b) {
		this();
	}
	public Faith(int i) {
		System.out.println("origin = " + i);
		System.out.println("this = " + this.i);
		
		System.out.println("--------Add this------------------");
		this.i = i;
		System.out.println("origin = " + i);
		System.out.println("this = " + this.i);
		
	}
	public Faith(String a, int b) {
		this(b);
		System.out.println(Integer.valueOf(a) + b);
	}
	
	
	/*********************************************************************************/
	
	
	
	
	
	
	
	
}