package com.ThreadCompute;

public class SequentialPrimeFinder extends AbstractPrimeFinder {

	@Override
	public int countPrimes(final int number) {
		// TODO Auto-generated method stub
		return countPrimesInRange(1, number);
	}
	
	public static void main(String[] args){  
        //计算的区间为1到10000000  
        new SequentialPrimeFinder().timeAndCompute(10000000);  
    }  
}
