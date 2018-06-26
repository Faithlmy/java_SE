package com.LearnThread;

import java.util.concurrent.TimeUnit;
import static java.lang.System.*;

public class Compute3{

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

class BM111 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			Compute3 c = new Compute3();
			c.BaseMethod1();
		}
	}
	 
 }
 
class BM222 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			Compute3 c = new Compute3();
			c.BaseMethod2();
		}
	}
	 
 }
 
 
 
 
 