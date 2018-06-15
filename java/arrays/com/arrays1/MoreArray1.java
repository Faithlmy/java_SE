package com.arrays1;

import java.util.Random;
import static java.lang.System.*;

public class MoreArray1 {
	
	static Random random = new Random();
	static int pRand(int mod ) {
		return Math.abs(random.nextInt()) % mod + 1;
	}

	
	public static void main(String[] args) {
		
		mythis mt = new mythis();
		mt.p();
		mt.k(45, 55);
		mt.p();
		int [][] a1 = {
				{1, 2, 3},
				{4, 9, 8}
		};
		
		for(int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length; j++) {
				System.out.println(a1[i][j]);
			}
		}
	}
}

class mythis{
	int s = 9;
	static int b = 78;
	
	public void k(int a, int n) {
		this.s = a;
		b = n;
	}
	public void p() {
		int c = this.b + 1;
		System.out.println("s = " + s);
		System.out.println("this.s = " + this.s);
		System.out.println("===================");
		out.println("b = " + b);
		out.println("this.b = " + this.b);
		System.out.println("===================");
		out.println(c);
	}
	
}