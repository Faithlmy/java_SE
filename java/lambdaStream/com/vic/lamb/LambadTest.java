package com.vic.lamb;

public class LambadTest {
	public static void main(String[] args) {
		DogService s1 = (name) -> "name is: " + name;
//		System.out.println(s1.who("res"));
		
		DogService s2 = (name) ->{
			System.out.println("ww");
			return "name is: "+name ;
		};
		System.out.println(s2.who("999"));
		
		
	}
}
