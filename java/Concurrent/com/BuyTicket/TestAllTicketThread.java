package com.BuyTicket;

public class TestAllTicketThread {

	public static void main(String[] args)
	{
		AllTicketThread t1 = new AllTicketThread("A");
		AllTicketThread t2 = new AllTicketThread("B");
		AllTicketThread t3 = new AllTicketThread("C");

		t1.start();
		t2.start();
		t3.start();
	}
}
