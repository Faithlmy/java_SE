package access1;

public class Paccess {
	public static void main(String []args) {
		Sun s = new Sun();
		int a = s.Pri(6);
		int b = s.Pro(9);
		int c = s.Pub(8);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		Hub h = new Hub();
		int a1 = h.Pub(110);
		int a2 = h.FaithPro(5);
		
		System.out.println(a1);
		System.out.println(a2);
	}

}



class Sun{
	public int b;
	private int i ;
	public int Pri(int a) {
		i = a;
		return i;
	}
	public int Pub(int b) {
		this.i = b;
		this.b = b;
		return i + b;
	}
	
	protected int Pro(int b) {
		this.i = b;
		this.b = b;
		return i + b;
	}
	
	private int Pr(int b) {
		this.i = b;
		this.b = b;
		return i + b;
	}
}

class Hub{
	Sun s = new Sun();
	public int Pub(int b) {
		s.b = b;
		return  b;
	}
	public int FaithPro(int c) {
		c = c * s.Pro(5);
		return c;
	}
}
