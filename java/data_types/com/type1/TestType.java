package com.type1;

public class TestType {
	public static void main(String[] args) {
		
		System.out.println(Float.MAX_VALUE + ", " + Float.MIN_VALUE);
		Integer in = new Integer(2147483647); // 21474836467
		System.out.println(in.MAX_VALUE);
		System.out.println();
		System.out.println("===========================================================");
		
		// Auto conversion data types
	    byte b = 0;
        int i = b;
        long l = b;
        float f = b;
        double d = b;
        
        System.out.println("l="+l);
        System.out.println("f="+f);
        System.out.println("d="+d);
        System.out.println("===============================================================");
        
        // Cast data types
        int k = 99;
        byte k1 = (byte)k;
        System.out.println(k);
        System.out.println(k1);
        System.out.println((float)k);
        System.out.println((double)k);
        System.out.println("============================================================");
        
        int n = 100;
        Float n1 = new Float(n);
        double n2 = n1.doubleValue();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("==================================================================");
        
        int m = 89;
        Integer m1 = new Integer(m);
        String m2 = m1.toString();
        System.out.println(m2);
	}

}