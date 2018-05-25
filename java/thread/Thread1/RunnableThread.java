package Thread1;

public class RunnableThread implements Runnable {
	
	private String name;
	
	public RunnableThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + " " + Thread.currentThread().getId());
		
	}

}
