package com.arrays2;
import static java.lang.System.*;

class Weeble {}
public class ArraySize {
	
	public static void main(String[] args) {
		Weeble[] a;
		Weeble[] b = new Weeble[5];
		Weeble[] c = new Weeble[4];
		
		for(int i = 0; i < c.length; i++) 
		{
			c[i] = new Weeble();
		}
		Weeble[] d = {
				new Weeble(), new Weeble(), new Weeble()
		};
		out.println(d.length);
		for(int j = 0; j < d.length; j++) {
			out.println(d[j]);
		}
		
		//
		int[]  k;
		int[] k1 = new int[8];
	}
}
