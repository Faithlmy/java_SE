package java.annotation1;

public class Test {
	
	public static void main(String[] args) {
		Child c = new Child();
		c.work();
		
		// desprecation
		Test t = new Test();
		t.work();
	}

	@SuppressWarnings("deprecation")
	public void work() {
		People p = new Child();
		p.work();
	}
}
