package com.d1;

public class FaceInterExtends extends FaceInter {

	public static void main(String[] args) {
//		FaceInterExtends f = new FaceInterExtends();
//		f.man();
		FaithClass fc = new FaithClass();
		int j = 2;
		for(int i = 0; i < 5; i ++) {
			fc.fun(i, j);
			j++;
		}
	}
}

class FaithClass{
	FaithClass(){}
	
	public void fun( final int a, final int b) {
		System.out.println( a + b);
	}
}