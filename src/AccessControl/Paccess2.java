package AccessControl;

public class Paccess2 {
	public int b;
	private int i ;
	public Paccess2(){
		Sun2 s = new Sun2();
		 s.Pri(10);
		System.out.println("faith");

	}
	
	
	public int Pub(int b) {
		int z;
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



class Sun2{
	public int b;
	private int i ;
	public void Pri(int a) {
		i = a;
		System.out.println(i);
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

class Hub2{
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
