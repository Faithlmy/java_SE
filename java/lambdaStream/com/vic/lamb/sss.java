package com.vic.lamb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class sss {

	
	public static void main(String[] args){
		  List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		  
		   List<?> kl =  kl(languages);
		   
		   List<String> d = new ArrayList<>();
		   d.add("klkl");
		   d.add("mmm");
		   
		   List<String> c = new ArrayList<>();
		   c.add("cc");
		   c.add("vc");
		   List<List<String>> p = new ArrayList<>();
		   p.add(d);
		   p.add(c);
		   System.out.println(p.get(1));

//		  System.out.println("Languages which starts with J :");
//		  filter(languages, (str)->((String) str).startsWith("J"));
//
//		  System.out.println("Languages which ends with a ");
//		  filter(languages, (str)->((String) str).endsWith("a"));
//
//		  System.out.println("Print all languages :");
//		  filter(languages, (str)->true);
//
//		   System.out.println("Print no language : ");
//		   filter(languages, (str)->false);
//
//		   System.out.println("Print language whose length greater than 4:");
//		   filter(languages, (str)->((String) str).length() > 4);
		}
	

		 public static void filter(List names, Predicate   condition) {
//			 condition.a
			 Predicate p = (str)->((String) str).length() > 4;
			 boolean m = p.equals(p);
			 Consumer<String> con = (str)-> System.out.println(0);
//			 Function<> lp = (str)->((String) str).length() - 4;
//			 Supplier
//			 names.forEach(name -> {System.out.println(name);});
		    for(Object name: names)  {
		       if(condition.test(name)) {
		          System.out.println(name + " ");
		       }
		    }
		  }
		 
		 public static Predicate gg(){
			 return (str)->((String) str).length() > 4;
		 }
		 
		 public static Function<String,Integer> kk() {
			 return s -> s.length() ;
		 }
		 
		 public static  List<?> kl (List<?> list){
			 for(int i = 0; i < list.size(); i++) {
				 System.out.println(list.get(i));
			 }
			 return list;
		 }
		 
//		}
		 
		 
}
