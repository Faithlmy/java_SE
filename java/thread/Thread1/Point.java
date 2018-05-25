package Thread1;

public class Point {
	public static void main(String[] args) {
		add a = new add(2);
		a.a();
		bdd b = new bdd();
		b.a(5, 6);
	}

}

class add{
	private int sum;
	
	public add(int sum) {
		this.sum = sum;
	}
	public void a() {
		for(int i = 0; i < 3; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

class bdd{
	private int sum;
	
	public void a(int a, int b) {
		sum = a * b;
		System.out.println(sum);
	}
}