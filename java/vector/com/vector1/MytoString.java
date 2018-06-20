package com.vector1;

import java.util.Vector;
import static java.lang.System.*;

public class MytoString {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0 ; i < 5; i++) {
			v.addElement(new FaithJava());
		}
		out.println(v);
	}
}

class FaithJava{
	public String ToString() {
		return "Faith:  " + this + '\n';
	}
}