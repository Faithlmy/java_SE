package ThreadLearn;

public class Test {
	
	public static void main(String[] args) {
//		System.out.println("Origin ID: " + Thread.currentThread().getId());
//		ThreadMy tl1 = new ThreadMy("start_ID1");
//		tl1.start(); //  this method  create a new thread
//		ThreadMy tl2 = new ThreadMy("run_ID2");
//		tl2.run(); // this method  call thread
//		/*
//		 *  Origin ID: 1
//			run_ID2  1
//			start_ID1  8
//			 The result describe that creating a new thread do not block calling thread.  
//		 * */
//		
//		ThreadImplete ti = new ThreadImplete("im");
//		Thread th = new Thread(ti);
//		th.start();
		
		
		RunnableDemo rd = new RunnableDemo("Demo");
		rd.start();
	}
}
