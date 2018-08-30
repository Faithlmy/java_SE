package com.vic.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class vic {
	public static void main(String[] args) {
//		List<String> list = new ArrayList();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("a");
//		List<String> res = list.stream().limit(2).collect(list.toArray(a));
		//
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
		
		//
		List<String> list = Arrays.asList("a", "a", "b", "c", "a", "d");
		list.stream().distinct().forEach(System.out::println);
		List<String> res = list.stream().distinct().collect(Collectors.toList());
		System.out.println(res);
		
		//
		List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
		List<Integer> resw = words.stream().map(String::length).collect(Collectors.toList());
//		Map resw = words.stream().map(String::length).collect(Collectors.mapping(mapper, downstream));
		System.out.println(resw);
		
		//  Optional<Integer> max = numbers.stream().reduce(Integer::max);
		
		Optional<Integer> max = resw.stream().reduce(Integer:: max);
		System.out.println(max);
		
		
		
		
		
		
		
		
    }
}
