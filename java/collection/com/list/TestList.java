package com.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestList {

	@Test
	public void TestAllList() {
		char b = 'u';
		int c = b;
		System.out.println(c);
		System.out.println((byte)b);
//		LetterToAscii("d");
//		String letter = null;
//		letter = NumberToLetter(1);
//		int a = LetterToNumber("C");
//		System.out.println(a);
	}
	
	/*
	 * ublic static void letterToNum(String input) {
		for (byte b : input.getBytes()) {
			System.out.print(b - 96);
		}

	 * */
	// Turn number and alp
	public byte[] LetterToAscii(String inputLetter) {
		byte[] num;
		int a = inputLetter.indexOf(inputLetter);
		num = inputLetter.getBytes();
//		System.out.println(num);
		System.out.println(a);
		return num;
	}
	
	
	//数字转字母 1-26 ： A-Z
	private String NumberToLetter(int num) {
	    if (num <= 0) {
	        return null;
	    }
	    String letter = "";
	    num--;
	    do {
	        if (letter.length() > 0) {
	            num--;
	        }
	        letter = ((char) (num % 26 + (int) 'A')) + letter;
	        num = (int) ((num - num % 26) / 26);
	    } while (num > 0);

	    return letter;
	}
	
	// 字母转数字
	public int LetterToNumber(String letter) {
	    int length = letter.length();
	    int num = 0;
	    int number = 0;
	    for(int i = 0; i < length; i++) {
	        char ch = letter.charAt(length - i - 1);
	        num = (int)(ch - 'A' + 1) ;
	        num *= Math.pow(26, i);
	        number += num;
	    }
	    return number;
	}
	//
	// Create List
	public List<String> CreateList(){
		List<String> list = new ArrayList<String>();
		int i = 0;
		String letter = null;
		while( i< 5) {
			letter = NumberToLetter(i);
			list.add(letter);
			i++;
		}
		return list;
	}
}
