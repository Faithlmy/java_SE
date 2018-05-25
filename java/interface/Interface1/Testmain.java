package Interface1;

public class Testmain {
	public static void main(String []args) {
		iphone i = new iphone();
		i.install();
		i.work();
		int r = i.write(2, 5);
		System.out.println(r);
		
		computer c = new computer();
		c.FunCom(2, 9);
		
		mp3 m = new mp3();
		m.install();
		m.work();
	}

}
