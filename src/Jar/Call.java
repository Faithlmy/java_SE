package Jar;

import AccessControl.Package;
import AccessControl.Pluss;
/**
 * @author root
 * This file test my Untitled.jar
 *  The resource of jar is Pluss.java
 */
public class Call {
	public static void main(String []args) {
		Package p = new Package();
		p.P();
		
		Pluss ps = new Pluss();
		ps.Add(2, 9);
		
	}

}
