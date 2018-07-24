package com.d1;

public class IceCream {// p214

	static String[] flav = {
			"a", "b","c"
	};
	@SuppressWarnings("unused")
	static String[] floSet(int n) {
		n = Math.abs(n) % (flav.length + 1);
		String[] res = new String[n];
		int[] pick = new int[n];
		for(int i = 0; i < pick.length; i++) {
			pick[i] = -1;
		}
		for(int i = 0; i < pick.length; i++) {
			retry:
				while(true) {
					int t = (int)(Math.random() * flav.length);
					for(int j = 0; j < i; j++) {
						if(pick[j] == t) {
							continue retry;
						}
						pick[i] = t;
						res[i] = flav[t];
						break;
					}
				}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		for(int j = 0; j < 20; j++) {
			System.out.println(j);
		}
		String[] fl = floSet(flav.length);
		for(int i = 0; i < fl.length; i++) {
			System.out.println(fl[i]);
		}
	}
}
