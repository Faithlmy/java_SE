package com.vic.lamb;

public interface Phone {
	void call();
	default String who(String name) {
		return name;
	}
	
//	public String w(String name);
}
