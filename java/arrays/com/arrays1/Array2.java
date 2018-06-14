package com.arrays1;

import java.util.Random;

public class Array2 {
	
	static Random rd = new Random();
	static int pRand(int mod) {
		return Math.abs(rd.nextInt()) % mod + 1;
	}
	
	public static void main(String[] args) {
		int[] a;
		a = new int[pRand(20)];
		System.out.println(a.length);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
