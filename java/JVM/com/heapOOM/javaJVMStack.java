package com.heapOOM;

public class javaJVMStack {

	private int stacklength = 1;
	public void stackLeak() 
	{
		stacklength++;
		stackLeak();
	}
	
	public static void main(String[] args) 
	{
		javaJVMStack jjs = new javaJVMStack();
		try
		{
			jjs.stackLeak();
		}catch(Throwable e)
		{
			System.out.println("stacklength:" + jjs.stacklength);
			throw e;
		}
	}
}
/*
 * 内存无法分配的时候报:
 *
 * 18372
 * Exception in thread "main" java.lang.StackOverflowError
 * 
 */