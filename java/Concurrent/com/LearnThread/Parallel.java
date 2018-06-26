package com.LearnThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Parallel {

	public static void main(String[] args)
	{
		ExecutorService es = Executors.newFixedThreadPool(2);
		long startTime = System.currentTimeMillis();
		es.execute(new Runnable()
				{
					public void run()
					{
						try
						{
							TimeUnit.SECONDS.sleep(2);
						}catch(Exception e)
						{
							e.printStackTrace();
						}
					}
				});
		es.execute(new Runnable()
		{
			public void run()
			{
				try
				{
					TimeUnit.SECONDS.sleep(5);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		long endTime = System.currentTimeMillis();
		System.out.println("All Time: " + (endTime - startTime));
		es.shutdown();
	}
}
