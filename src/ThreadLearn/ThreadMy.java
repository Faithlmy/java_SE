package ThreadLearn;

public class ThreadMy extends Thread {
	
	private String name;
	
	public ThreadMy(String name) {
		this.name = name;
	}
	
	public void run() {  // overwrite the function of run()
		System.out.println( name + " " + " " + Thread.currentThread().getId());
	}

}
