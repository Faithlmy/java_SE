package com.hashmap1;

import static java.lang.System.*;
public class Enumeration {

	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object nextElement() {
		// TODO Auto-generated method stub
		return null;
	}

}


class PrintData {
	 static void print(Enumeration e) {
		 while(e.hasMoreElements())
			 System.out.println(e.nextElement().toString());
	 }
}