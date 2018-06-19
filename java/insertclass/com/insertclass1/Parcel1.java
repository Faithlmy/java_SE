package com.insertclass1;

import static java.lang.System.*;

public class Parcel1 {
	
	class Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	class Destination{
		private String lable;
		public Destination(String lableTo) {
			lable = lableTo;
		}
		public String ReadLable() {
			return lable;
		}
	}

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
	}
	
	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Faith");
		out.println();
	}
}
