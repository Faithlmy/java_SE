package Interface;

public class Testmain {
	public static void main(String []args) {
		iphone i = new iphone();
		i.install();
		i.work();
		
		computer c = new computer();
		c.FunCom(2, 9);
		
		mp3 m = new mp3();
		m.install();
		m.work();
	}

}