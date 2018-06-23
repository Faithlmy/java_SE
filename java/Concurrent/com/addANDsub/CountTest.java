package com.addANDsub;

public class CountTest {

	   public static void main(String[] args) {
	        Count c=new Count();
	        Add add=new Add(c);
	        Sub sub=new Sub(c);
	        Thread t1=new Thread(add);
	        Thread t2=new Thread(add);
	        Thread t3=new Thread(sub);
	        Thread t4=new Thread(sub);
	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();

	    }
}
