package com.arrays1;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// init array: the two method.
		int a1[] = {1, 3, 5};
		System.out.println(a1.length);
		int [] a2;
		int[] a3;
		a2 = new int[3];
		a3 = new int[5];
//		System.out.println("pp" + a2[2]);
		for(int i = 0; i < a1.length; i++) {
			a2[i] = a1[i];
		}
		for(int j = 0; j < a3.length; j++) {
			System.out.println(a3[j]);
		}
		
		//
		 Integer[] a = {
				 new Integer(1),
				 new Integer(2),
				 new Integer(3),
				 };
		 
		//
		Integer[] b = new Integer[] {
				 new Integer(1),
				 new Integer(2),
				 new Integer(3),
				 };
	}

}
