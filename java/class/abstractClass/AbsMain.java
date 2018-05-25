package abstractClass;

public class AbsMain extends Bird{
	public static void main(String[] args) {
		Air a = new Air();
		a.fly();
		int b = a.add(2, 3);
		System.out.println(b);
		
		AbsMain am = new AbsMain();
		am.myfaith();
		int res = am.paramAdd(7, 9);
		int res2 = am.add(90, 100);
		System.out.println(res);
		System.out.println(res2);
	}

	@Override
	public void myfaith() {
		// TODO Auto-generated method stub
		System.out.println("this is a myfaith");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public void birdfly() {
		// TODO Auto-generated method stub
		
	}

}
