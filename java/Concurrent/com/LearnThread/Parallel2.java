package com.LearnThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Parallel2 {

	public static void main(String[] args)
	{

	}
	public void AllRun() 
	{
		Compute c = new Compute();
		ExecutorService es = Executors.newFixedThreadPool(2);
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		
		System.out.println("All Time: " + (endTime - startTime));
	}
}
