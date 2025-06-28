package Coding.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheStringList {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "pea","apple", "orange", "banana", "apple","watermwlon");
		
		List<String> sorted = words.stream()
			.sorted((a,b)->Integer.compare(b.length(), a.length()))
			.collect(Collectors.toList());
		System.out.println(sorted);
		
		List<String> collect = words.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		System.out.println(collect);
		
		
		System.out.println("\nSorting Reversed Order by Alphabetic: ");
		List<String> collect2 = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
