package Coding.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstChar {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		
		Map<Character, List<String>> collect = words.stream()
			.collect(Collectors.groupingBy(a->a.charAt(0)));
		
		System.out.println(collect);
	}

}
