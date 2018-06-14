package com.arrays1;

import java.util.Random;

public class MoreArray1 {
	
	static Random random = new Random();
	static int pRand(int mod ) {
		return Math.abs(random.nextInt()) % mod + 1;
	}

	
	public static void main(String[] args) {
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
