package ThreadLearn;

public class ThreadImplete implements Runnable {
	
	private String name;
	
	public ThreadImplete(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + " " + Thread.currentThread().getId());
		
	}

}
