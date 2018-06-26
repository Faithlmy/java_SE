package com.BuyTicket;

import java.util.concurrent.TimeUnit;

public class AllTicketRunnable implements Runnable{

	private int t = 10;
	private String name;
	
	public AllTicketRunnable() {}
	public AllTicketRunnable(String name)
	{
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(t > 0)
		{
			t--;
			System.out.println("name is:" + Thread.currentThread().getName() + "  ,number is: " + t);
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
