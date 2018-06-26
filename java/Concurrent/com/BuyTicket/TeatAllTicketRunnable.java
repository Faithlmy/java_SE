package com.BuyTicket;

public class TeatAllTicketRunnable {

	public static void main(String[] args)
	{
		AllTicketRunnable at = new AllTicketRunnable();
		Thread t1 = new Thread(at, "A");
		Thread t2 = new Thread(at, "B");
		Thread t3 = new Thread(at, "C");
		t1.start();
		t2.start();
		t3.start();
	}
}
