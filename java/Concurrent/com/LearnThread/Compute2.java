package com.LearnThread;

import java.util.concurrent.TimeUnit;
import static java.lang.System.*;

public class Compute2{

	public void BaseMethod1() 
	{
		try
		{
			TimeUnit.SECONDS.sleep(2);
			out.println("D1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void BaseMethod2() 
	{
		try
		{
			TimeUnit.SECONDS.sleep(2);
			out.println("K");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class BM11 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			Compute2 c = new Compute2();
			c.BaseMethod1();
		}
	}
	 
 }
 
class BM22 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			Compute2 c = new Compute2();
			c.BaseMethod2();
		}
	}
	 
 }
 
 
 
 
 