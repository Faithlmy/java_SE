package com.LearnThread;

public class TestImplementRunnable {

	public static void main(String[] args)
	{
		Runnable r1 = new BM11();
		Runnable r2 = new BM22();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		long startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		long endTime = System.currentTimeMillis();
		System.out.println("All Time: " + (endTime - startTime));
	}
}
