package Coding.StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDup {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple","BANANA");

		List<Entry<String, Long>> collect = words.stream()
			.map(String::toLowerCase)
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet()
			.stream()
			.filter(a->a.getValue()>2)
			.collect(Collectors.toList());
		
		System.out.println(collect);
		
		//WAY 2
		
		Set<String> seen=new HashSet<>();
		
		List<String> collect2 = words.stream().map(String::toLowerCase)
							.filter(a->!seen.add(a))
							.distinct()
							.collect(Collectors.toList());
		System.out.println(collect2);
		
	}

}
