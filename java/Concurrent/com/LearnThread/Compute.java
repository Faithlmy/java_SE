package com.LearnThread;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Compute{

	public void BaseMethod1() 
	{
		try
		{
			TimeUnit.SECONDS.sleep(20);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void BaseMethod2() 
	{
		try
		{
			TimeUnit.SECONDS.sleep(50);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class BM1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Compute c = new Compute();
		c.BaseMethod1();
	}
	 
 }
 
class BM2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Compute c = new Compute();
		c.BaseMethod2();
	}
	 
 }
 
 
 
 
 