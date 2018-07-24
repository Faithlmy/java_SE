package com.d1;

import java.util.Vector;

public class CrashJava {

	public CrashJava CrashJava() {
		return this;
	}
	public static void main(String[] args) {
		Vector v = new Vector<>();
		for(int i = 0; i < 3; i++) {
			v.addElement(new CrashJava());
		}
		System.out.println(v);
	}
}
