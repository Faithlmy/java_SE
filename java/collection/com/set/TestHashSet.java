package com.set;
/*
 * 1. 集合Set是Collection的子接口，Set不允许其数据元素重复出现, 对象是无序, 类允许null元素
 * 
 * 2. 当我们使用HashSet存储自定义类时，需要在自定义类中重写equals和hashCode方法，
 *    主要原因是集合内不允许有重复的数据元素，在集合校验元素的有效性时（数据元素不可重复），
 *    需要调用equals和hashCode验证
 *    
 * 3. TreeSet: 底层数据结构是：二叉树
 * */

import java.util.HashSet;
import java.util.TreeSet;

import org.junit.Test;

// Create HashSet
public class TestHashSet {
	
	@Test
	public void THashSet() {
//		HashSet hs = new HashSet();
//		hs = CreateHashSet();
//		System.out.println(hs);
		CreateTreeSet();
	}

	public HashSet<String> CreateHashSet(){
		HashSet<String>  hs = new HashSet<String>();
		hs.add("p");
		hs.add("k");
		hs.add("m");
		hs.add("p");
		return hs;
	}
	
	public void CreateTreeSet() {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("op");
		ts.add("kk");
		System.out.println(ts);
	}
}
