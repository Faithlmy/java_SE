package com.list;

/*
 * Stack是基于数组实现的，是栈，它继承与Vector，特性是FILO（先进后出）
 * 
 * Vector:内部是数组数据结构，是同步的，100%延长数组，增删查询都很慢, 是线程安全的。

   ArrayList:内部是数组数据结构，是不同步的，替代了Vector，50%延长数组，查询的数度快。

   LinkedList:内部是链表数据结构，是不同步的，增删元素速度快, 可以被当做堆栈使用
   
   List基本上都是以Array为基础（LinkedList是以链表存储）。但是Set则是 在HashMap的基础上来实现的，
   这个就是Set和List的根本区别。HashSet的存储方式是把HashMap中的Key作为Set的对应存储项。
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

public class TestList {

	@Test
	public void TestAllList() {
//		char b = 'u';
//		int c = b;
//		System.out.println(c);
//		System.out.println((byte)b);
//		LetterToAscii("d");
//		String letter = null;
//		letter = NumberToLetter(1);
//		int a = LetterToNumber("C");
//		System.out.println(a);
		CreateVoctor();
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
	
	// Create vector
	
	public void CreateVoctor() {
		List<String> list = new Vector<String>();
		list.add("faith");
		list.add("meng");
		list.add("g");
		list.add("meng");
//		System.out.println(list.remove(1));
		System.out.println(list);
	}
}
