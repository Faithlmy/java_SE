package com.d1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stacks {

	  static String[] months = { 
			    "January", "February", "March", "April",
			    "May", "June", "July", "August", "September",
			    "October", "November", "December" };
	  public static void main(String[] args) {
		  Stacks s = new Stacks();
//		  s.st(months);
//		  s.sa(months);
//		  System.out.println();
//		  s.sb(months);
		  s.ss(months);
	}
	  
	  
	  public void ss(String[] m) {
		  Stack s = new Stack();
		  
		  for(int i = 0 ; i < m.length; i++) {
			  s.push(m[i] + " ");
		  }
		  System.out.println(s);
		  s.addElement("last");
		  System.out.println(s.elementAt(5));
		  while(!s.empty()) {
			  System.out.println("pop: " + s.pop());
		  }
	  }
	  
	  // ջ
	  public void st(String[] m) {
		  Stack c  = new Stack<>();
		  for(int i = 0; i < m.length; i++) {
			  c.push(m[i]);
		  }
		  System.out.println(c);
	 }
	  // ����
	  public void sa(String[] m) {
		  String[] c = new String[m.length];
		  for(int i = 0; i < m.length; i++) {
			  c[i] = m[i];
		  }
		  for(int i = 0; i <c.length; i++) {
			  System.out.print(c[i] + " ");
		  }
	  }
	  // list
	  public void sb(String[] m) {
		  List l = new ArrayList<>();
		  for(int i = 0; i < m.length; i++) {
			  l.add(m[i]);
		  }
		  System.out.println(l);
	  }
}
