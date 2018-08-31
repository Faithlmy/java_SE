package com.vic.loop;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class AllLoop {
	
	
	// Stream API提供了两个静态方法来从函数生成流：Stream.iterate和Stream.generate  两种方法都可以创建无限流
//	1.迭代iterate 
//	迭代法创建流通常用于按照某个创建原则（例如函数）依次生成一系列值的时候，而且为了避免无限流通常需要进行limit限制。 
	 public static void createStreamByFunctionIterate() {
	        Stream.iterate(0, n -> n + 2)
	                .limit(10)
	                .forEach(System.out::println);
	        //菲波纳契数列
	        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
	                .limit(10)
	                .map(t -> t[0])
	                .forEach(System.out::println);
	    }
	
	
	 public static void createStreamByFile() throws IOException {
	        long wordsNumbers = 0;
	        try (Stream<String> lines = Files.lines(Paths.get("/home/res.txt"), Charset.defaultCharset())) {
	            wordsNumbers = lines.flatMap(line -> Arrays.stream(line.split("")))
	                    .distinct()
	                    .count();
	        }
	        System.out.println("---数量是: " + wordsNumbers + "---");
	    }
	
	
	 public static void createStreamByList() {
	        List<String> list = new ArrayList<>();
	        list.add("Java");
	        list.add("python");
	        list.add("c");

	        Stream<String> listStream = list.stream();
	        listStream.forEach(System.out::println);
	    }
	
	
	Stream<String> str = Stream.of("java", "c", "python");
	
    Integer[] numbers = {1, 2, 6, 78, 45};
    Stream<Integer> stream2 = Arrays.stream(numbers);
	
	public static void filterTest(List<String> languages, Predicate<String> condition) {
        languages.stream().filter(x -> condition.test(x)).forEach(x -> System.out.println(x + " "));
    }
	


	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java","Python","scala","Shell","R");
		filterTest(languages,x -> x.endsWith("a"));
	}
	
	
	
	
//	@Test
	public void mapTest() {
		List<Double> db = Arrays.asList(10.0, 20.0, 30.0);
		List<Double> alldb = db.stream().filter(x -> x < 22.0).collect(Collectors.toList());
		System.out.println(alldb);
		alldb.forEach(x -> System.out.println(x));
	}
	
	
//	@Test
//	public void mapTest() {
//		List<Double> db = Arrays.asList(10.0, 20.0, 30.0);
//		db.stream().map(x -> x + x * 0.05).forEach(x -> System.out.println(x));
//	}
	
//	@Test
//	public void mapTest() {
//		List<Double> db = Arrays.asList(10.0, 20.0, 30.0);
//		double alldb = db.stream().map(x -> x + x * 0.05).reduce((sum, x) -> sum + x).get();
//		System.out.println(db);
//		System.out.println(alldb);
//	}
	
//	@Test
    public void iterTest() {
        List<String> languages = Arrays.asList("java","scala","python");
        //before java8
        for(String each:languages) {
            System.out.println(each);
        }
        //after java8
        languages.forEach(x -> System.out.println(x));
        languages.forEach(System.out::println);
    }
	
	// 产生随机list
	public List<Integer> randomList(){
		List<Integer> res = new ArrayList<>();
		res.add(2);
		res.add(3);
		res.add(5);
//		for(int i = 0; i < 5; i++) {
//			int radom = (int)(1+Math.random()*100);
//			res.add(radom);
//		}
		return res;
	}
	// 迭代遍历
	public int iteratorMaxInteger(List<Integer> list) {
	    int max = Integer.MIN_VALUE;
	    for (Iterator it = list.iterator(); it.hasNext(); ) {
	        max = Integer.max(max, (int) it.next());
	    }
	    return max;
	}
	
	// for Each 循环
	public int forEachLoopMaxInteger(List<Integer> list) {
	    int max = Integer.MIN_VALUE;
	    for (int n : list) {
	        max = Integer.max(max, (int) n);
	    }
	    return max;
	}
	
	// 常规for循环
	public int forMaxInteger(List<Integer> list) {
	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < list.size(); i++) {
	        max = Integer.max(max, (int) list.get(i));
	    }
	    return max;
	}

	// 并行 stream 流遍历
	public int parallelStreamMaxInteger(List<Integer> list) {
	    Optional max = list.parallelStream().reduce(Integer::max);
	    return (int) max.get();
	}
	
	// stream流遍历
	public int streamMaxInteger(List<Integer> list) {
	    Optional max = list.stream().reduce(Integer::max);
	    return (int) max.get();
	}
	
	// lambda表达式遍历
	public int lambdaMaxInteger(List<Integer> list) {
	    return list.stream().reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b));
	}
	
	
	public void oldRunnable() {
		new Thread(
				new Runnable() {
					@Override
					public void run() {
						System.out.println("run");
					}
				}).start(); 
	}
	
	public void lambdaRun() {
		new Thread(
				() -> System.out.println("run")
				).start();
	}
	
	
	
	
}
