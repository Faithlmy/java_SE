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
	public static void main(String[] args) throws Throwable{
		SAVE_HOOK = new FinalizeGC();
		// 对象第一次成功拯救自己
		SAVE_HOOK = null;
		System.gc();
		// 因为finalize的优先级低，故用sleep等待
		Thread.sleep(500);
		if(SAVE_HOOK != null)
		{
			SAVE_HOOK.isLive();
		}else
		{
			System.out.println("dead!");
		}
		
		//finalize()方法只会被系统调用一次，如果对象下一次面临回收，finalize()将不会被执行
		SAVE_HOOK = null;
		System.gc();
		// 因为finalize的优先级低，故用sleep等待
		Thread.sleep(500);
		if(SAVE_HOOK != null)
		{
			SAVE_HOOK.isLive();
		}else
		{
			System.out.println("dead!");
		}
	}
}
/**
 * 一个对象真正死亡要经过两次标记：
第一次标记：没有和GC root相连， 并筛选(条件：此对象是否有必要执行finalize方法)， 当对象没有覆盖finalize防范或者已经被jvm执行过，jvm将视为没有必要执行。如果对象被判为有必要执行finalize()时，对象将会被放在F-Queue里面
第二次标记：
 */