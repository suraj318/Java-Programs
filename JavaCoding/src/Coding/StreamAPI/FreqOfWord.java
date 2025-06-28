package Coding.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfWord {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		
		Map<String, Long> collect = words.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
			
	}

}
