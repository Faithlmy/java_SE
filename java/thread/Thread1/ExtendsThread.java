package Thread1;

public class ExtendsThread extends Thread {
	
	private String name;
	
	public ExtendsThread(String name) {
		this.name = name;
	}
	
	public void run() {  // overwrite the function of run()
		System.out.println( name + " " + " " + Thread.currentThread().getId());
	}

}
