package com.type1;

public class IntAndInteger {

	public static void main(String[] args) {
        Integer i = new Integer(128);  
        Integer i2 = 128;  
          
        System.out.println("i == i2 -->" +  (i == i2));
        System.out.println( "i.equals(i2)--> " + i.equals(i2));
          
        Integer i3 = new Integer(127);  
        Integer i4 = 127;  
        System.out.println("i3 == i4 -->" + (i3 == i4));
        System.out.println("i3.equals(i4)-->" + i3.equals(i4));
          
        Integer i5 = 128;  
        Integer i6 = 128;  
        System.out.println("i5 == i6--> " + (i5 == i6));
        System.out.println("i5.equals(i6)-->" + i5.equals(i6));
          
        Integer i7 = 127;  
        Integer i8 = 127;  
        System.out.println("i7 == i8--> " + (i7 == i8));
	}
}
