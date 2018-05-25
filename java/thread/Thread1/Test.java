package Thread1;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Origin ID: " + Thread.currentThread().getId());
		ExtendsThread tl1 = new ExtendsThread("start_ID1");
		tl1.start(); //  this method  create a new thread
		ExtendsThread tl2 = new ExtendsThread("run_ID2");
		tl2.run(); // this method  call thread
		/*
		 *  Origin ID: 1
			run_ID2  1
			start_ID1  8
			 The result describe that creating a new thread do not block calling thread.  
		 * */
		
		ExtendsThread ti = new ExtendsThread("im");
		Thread th = new Thread(ti);
		th.start();
		
	
	}
}
