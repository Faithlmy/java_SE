package com.memory;

public class FinalizeGC {

	public static FinalizeGC SAVE_HOOK = null;
	
	public void isLive() {
		System.out.println("yes, alive");
	}
	
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalized method");
		FinalizeGC.SAVE_HOOK = this;
	}
	public static void main(String[] args) {
		System.out.println("k");
	}
}
