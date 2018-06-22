package com.heapOOM;

import java.util.ArrayList;
import java.util.List;

public class HeapOom {

	//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	static class OOMObject{
		public static void main(String[] args) {
			List<OOMObject> list = new ArrayList<OOMObject>();
			while(true) {
				list.add(new OOMObject());
			}
		}
	}
}
