package com.vector1;

import static java.lang.System.*;
import java.util.BitSet;
import java.util.Random;

public class MyBitSet {

	public static void main(String[] args) 
	{
		
		// byte
		Random rand = new Random();
		byte bt = (byte)rand.nextInt();
		BitSet bb = new BitSet();
		for(int i = 7; i >=0; i--) 
		{
			 if(((1 << i) & bt) != 0) 
				 bb.set(i);
			 else
				 bb.clear(i);
		 }
		 System.out.println("byte value: " + bt);
		 printBitSet(bb);
		 out.println("============================================");
		 
		// short
		Random rd = new Random();
		short st = (short)rd.nextInt();
		BitSet bs = new BitSet();
		for(int j = 15; j >= 0 ; j--)
		{
			if(((1 << j) & st) != 0) 
				bs.set(j);
			else 
				bs.clear(j);
		}
		 System.out.println("byte value: " + st);
		 printBitSet(bs);
		 
	}

	static void printBitSet(BitSet b) 
	{
		 System.out.println("bits: " + b);
		 String bbits = new String();
		 for(int j = 0; j < b.size() ; j++)
			 bbits += (b.get(j) ? "1" : "0");
		 System.out.println("bit pattern: " + bbits);
	}
}




