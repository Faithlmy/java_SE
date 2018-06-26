package com.LearnThread;

public class TestExtendsTread {

	public static void main(String[] args)
	{
		Thread t1 = new BM111();
		Thread t2 = new BM222();
		t1.start();
		t2.start();
	}
}
