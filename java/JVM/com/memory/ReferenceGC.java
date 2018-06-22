package com.memory;

import junit.framework.TestCase;


// java中没有选择 引用记数法 来管理内存的原因是：引用记数法很难解决对象之间的循环利用问题
// java中用根搜索算法来管理对象
// 通过GC root向下搜索，当一个对象不能到GC root时候，证此对象不可用(从GC root到此对象不可达)
/**
 * 一个对象真正死亡要经过两次标记：
第一次标记：没有和GC root相连， 并筛选(条件：此对象是否有必要执行finalize方法)， 当对象没有覆盖finalize防范或者已经被jvm执行过，jvm将视为没有必要执行。如果对象被判为有必要执行finalize()时，对象将会被放在F-Queue里面
第二次标记：
 * 
 * jdk1.2后将引用分为：
 * 强引用
 * 弱引用
 * 软引用
 * 虚引用
 *
 */
public class ReferenceGC {

	public Object instance = null;
	public static final int _1MB = 1024 * 1024;
	
	private byte[] BigSize = new byte[2 * _1MB];
	
	public static void TestGC() 
	{
		ReferenceGC rgA = new ReferenceGC();
		ReferenceGC rgB = new ReferenceGC();
		rgA.instance = rgA;
		rgB.instance = rgB;
		
		rgA = null;
		rgB = null;
		System.gc();
	}
	
//	public static void main(String[] args)
//	{
//		TestGC tg = new TestCase();
//	}
}
