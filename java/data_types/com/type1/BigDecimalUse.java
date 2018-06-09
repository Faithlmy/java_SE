package com.type1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUse {
	public static void main(String[] args) {
		double d1 = 0.10334;  
	    double d2 = 1234.0;  
	      
	    System.out.println("new BigDecimal("+d1+")=" + new BigDecimal(d1)); //此种方式绝对不允许!!!!!  
//	    System.out.println("new BigDecimal("+d2+")=" + new BigDecimal(d2)); //此种方式绝对不允许!!!!!  
	    System.out.println(""); 
	    System.out.println("=================================================================");
	    
	    BigDecimal bd1 = new BigDecimal(Math.PI);
	    BigDecimal bd2 = new BigDecimal(2.3);
	    BigDecimal bd3 = new BigDecimal(4.1);
	    System.out.println(bd2.add(bd3));
	    System.out.println(2.2*0.1);
	    System.out.println(2.3/0.1);
	    System.out.println("2.3 = " + bd2);
	    System.out.println("=================================================================");
	    
	    // This is three mathod of create BigDecimal
	    BigDecimal c1 = BigDecimal.valueOf(2.3);
	    BigDecimal c2 = new BigDecimal(Double.toString(2.3));
	    BigDecimal c3 = new BigDecimal("2.3");
	    //
	    System.out.println("c1 = " + c1);
	    System.out.println("c2 = " + c2);
	    System.out.println("==================================================================");
	    
	    BigDecimal f1 = new BigDecimal("2.3");
	    BigDecimal f2 = new BigDecimal("0.1");
	    System.out.println(f1.add(f2));
	    System.out.println(f1.subtract(f2));
	    System.out.println(f1.multiply(f2));
	    System.out.println(f1.divide(f2));
	    System.out.println(c1.divide(f2));
	    System.out.println(c2.divide(f2));
	    System.out.println("=================================================================");
	    
	    BigDecimal n1 = BigDecimal.valueOf(Math.PI);
	    n1 = n1.setScale(30, RoundingMode.CEILING);
	    System.out.println(n1);
	}

}
