package com.d1;

import java.util.Vector;

public class WorksAnyway {

	public static void main(String[] args) {
	    Vector mice = new Vector();
	    for(int i = 0; i < 3; i++)
	    	mice.addElement(new Mouse(i));
	    for(int i = 0; i < mice.size(); i++) {
	        System.out.println("Free mouse: " + mice.elementAt(i));
	        MouseTrop.caughtYa(mice.elementAt(i));
	      }
	}
}

class Mouse{
	private int mouseNumber;
	Mouse(int i){
		mouseNumber = i;
	}
	public String toString() {
		return "This is Mouse #" + mouseNumber;
	}
  void print(String msg) {
	    if(msg != null) System.out.println(msg);
	    System.out.println("Mouse number " + mouseNumber);
	  }
}

class MouseTrop{
	  static void caughtYa(Object m) {
		  Mouse mouse = (Mouse)m; // Cast from Object
		  mouse.print("Caught one!");
		  }
}