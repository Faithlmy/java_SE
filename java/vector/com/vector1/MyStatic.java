package com.vector1;

import static java.lang.System.*;
import java.util.Stack;

public class MyStatic {

	 static String[] months = {
			 "January", "February", "March", "April",
			 "May", "June", "July", "August", "September",
			 "October", "November", "December" };
	 
	public static void main(String[] args)
	{
		Stack stk = new Stack();
		for(int i = 0; i < months.length; i++) 
		{
			stk.push(months[i] + " ");
		}
		out.println(stk);
		stk.addElement("This is last months: ");
		out.println(months[5]);
	}
}
