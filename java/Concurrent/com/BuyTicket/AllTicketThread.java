package com.BuyTicket;

import java.util.concurrent.TimeUnit;

public class AllTicketThread extends Thread {

	private int t = 5;
	private String name;
	
	public AllTicketThread() {}
	public AllTicketThread(String name)
	{
		this.name = name;
	}
	
	public void run()
	{
		while(t > 0)
		{
			t--;
			System.out.println("name is:" + name + "  ,number is: " + t);
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
