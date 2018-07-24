package com.d1;

import java.util.Random;

public class ArrayNew {

	  static Random rand = new Random();
	  static int pRand(Integer mod) {
	    return Math.abs(rand.nextInt()) % mod + 1;
	  }
	  public static void main(String[] args) {
//	    int[] a;
//	    a = new int[pRand(null)];
	    int [] b = {1, 5, 9, 6, 7};
	    a.b = b;
	    prt("length of a = " + a.b.length);
	    for(int i = 0; i < b.length-1; i++) {
	    	a.b[i] = b[i];
		    prt("a[" + i + "] = " + a.b[i]);
	    }
	    int [] c = {1, 5, 9, 6, 7};
	    a.setB(c);
	    System.out.println(a.getB().length);
	  }
	  static void prt(String s) {
	    System.out.println(s);
	  }
}

class a{
	static int[] b;

	public static int[] getB() {
		return b;
	}

	public static void setB(int[] b) {
		a.b = b;
	}

}
