package com.LearnThread;

public class Serial {

	public static void main(String[] args)
	{
//		Compute s = new Compute();
		long startTime = System.currentTimeMillis();
//		s.BaseMethod1();
//		s.BaseMethod2();
		BM1 bm1 = new BM1();
		BM2 bm2 = new BM2();
		bm1.run();
		bm2.run();
		long endTime = System.currentTimeMillis();
		
		System.out.println("All Time: " + (endTime - startTime));
		
	}
}
