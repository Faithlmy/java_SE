package com.map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class TestMap {

	@Test
	public void ShowAll() {
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		List<String> list = null;
//		map = CreateMap();
//		ShowCreateMap(CreateMap());
//		map = ShowCreateMap1(CreateMap());
//		list = ShowValue(CreateMap());
//		System.out.println(list);
//		ShowCreateMap2(CreateMap());
//		ShowCreateMap3(CreateMap());
//		ShowCreateMap4(CreateMap());
//		Hashtable<Integer, String> tab = new Hashtable<>();
//		System.out.println(CreateHashtable());
//		ShowHashtable1(CreateHashtable());
//		ShowHashtable2(CreateHashtable());
//		ShowHashtable3(CreateHashtable());
		ShowHashtable4(CreateHashtable());
	}
	
	/*=======================HashMap=========================================*/
	// create HashMap
	public Map<Integer, String> CreateMap(){
		Map<Integer, String> map = new HashMap<Integer, String>();
		int i = 0;
		while(i < 5) {
			map.put(i, "kk" + i);
			i++;
		}
		return map;
	}
	
	public void ShowMap() {
		Map<Integer, String> map = new HashMap<Integer, String>(); 
		Integer i = 0;
		while(i < 10) {
			map.put(i, "dd" + i);
			i++;
		}
		System.out.println(map);
	}


	
	// Entry function
	public Map<Integer, String> ShowCreateMap1(Map<Integer, String> map){
		Map<Integer,  String>  m = new HashMap<Integer, String>();
		for(Entry<Integer, String> entry: map.entrySet())
			m.put(entry.getKey(), entry.getValue());
		return m;
	}
	
	// Iterator funtion
	public void ShowCreateMap2(Map<Integer, String> map){
		Map<Integer,  String>  m = new HashMap<Integer, String>();
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
	}
	
	// 直接使用HashMap的keyset
	public void ShowCreateMap3(Map<Integer, String> map){
		for(Integer key: map.keySet()) {
			System.out.println("key:"+key + ", value:" + map.get(key));
		}
	}
	
	// 使用keyset的Iterator
	public void ShowCreateMap4(Map<Integer, String> map) {
		Iterator keyIterator = map.keySet().iterator();
		while(keyIterator.hasNext()) {
			Integer key = (Integer)keyIterator.next();
			System.out.println("key:"+key + ", value:" + map.get(key));
		}
	}
	
	// get value of HashMap using List
	public List<String> ShowValue(Map<Integer, String> map){
		List<String> list = new  ArrayList<String>();
		for(Entry<Integer, String> entry: map.entrySet())
			list.add(entry.getValue());
		return list;
	}
	
	
	/*============================  Hashtable ==========================================*/
	// create hashtable
	public Hashtable<Integer, String> CreateHashtable(){
		Hashtable<Integer, String> map = new Hashtable<>();
		int i = 0;
		while(i < 5) {
			map.put(i, "table" + i);
			i++;
		}
		return map;
	}
	
	// Entry
	public void ShowHashtable1(Hashtable<Integer, String> map) {
		Hashtable<Integer,  String>  m = new Hashtable<>();
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
	}
	
	// key
	public void ShowHashtable2(Hashtable<Integer, String> map) {
		for(Integer key: map.keySet()) {
			System.out.println("key: " + key + ", value: " + map.get(key));
		}
	}
	//  Iterator
	public void ShowHashtable3(Hashtable<Integer, String> map) {
		Iterator <Map.Entry<Integer, String>> it =map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
	}
	//Enumeration
	public void ShowHashtable4(Hashtable<Integer, String> map) {
		Enumeration<String> en = map.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
	 
}






