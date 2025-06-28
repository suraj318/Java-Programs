package Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("Apple","Banana","Mango","Watermelon","melon");

		Map<String, Integer> collect = list.stream()
			.collect(Collectors.toMap(Function.identity(), String::length));
		//System.out.println(collect);
		
		collect.forEach((a,b)->{
			System.out.println(a+ " : "+b);
		});
		
		Map<Character, Long> collect2 = list.stream()
				.map(String::toLowerCase)
			.collect(Collectors.groupingBy(a->a.charAt(0),
											Collectors.counting()));
		System.out.println(collect2);
		
	}

}
