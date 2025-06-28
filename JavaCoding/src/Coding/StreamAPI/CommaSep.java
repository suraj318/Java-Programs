package Coding.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSep {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple","watermelon","pea");
		
		String collect = words.stream()
			.collect(Collectors.joining(","));
		System.out.println(collect);
		
		
		String collect2 = words.stream().collect(Collectors.joining("-"));
		System.out.println(collect2);
		
	}

}
