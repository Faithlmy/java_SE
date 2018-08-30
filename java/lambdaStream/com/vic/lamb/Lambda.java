package com.vic.lamb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		Lambda l = new Lambda();
		l.fun2();
	}
	
	public void fun1() {
		String[] atp = {"Rafael Nadal", "Novak Djokovic",  
			       "Stanislas Wawrinka",  
			       "David Ferrer","Roger Federer",  
			       "Andy Murray","Tomas Berdych",  
			       "Juan Martin Del Potro"}; 
		List<String> p = Arrays.asList(atp);
		p.forEach(pp -> System.out.println(pp));
	}
	
	public void fun2() {
		String[] atp = {"Rafael Nadal", "Novak Djokovic",  
			       "Stanislas Wawrinka",  
			       "David Ferrer","Roger Federer",  
			       "Andy Murray","Tomas Berdych",  
			       "Juan Martin Del Potro"}; 
		List<String> p = Arrays.asList(atp);
		p.forEach(System.out::println);
	}

}
