package Coding.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListSort {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("ggg", "ww", "rrrrrr", "aaaa", "bbbb");

		// By Alphabetic
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);

		// By Alphabetic Reversed
		List<String> collect2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);

		// By Length Asc
		List<String> collect3 = list.stream().sorted((a, b) -> Integer.compare(a.length(), b.length()))
				.collect(Collectors.toList());
		System.out.println(collect3);

		// by length Desc
		List<String> collect4 = list.stream().sorted((a, b) -> Integer.compare(b.length(), a.length()))
				.collect(Collectors.toList());
		System.out.println(collect4);

		// Sum of Length
		int sum = list.stream().mapToInt(String::length).sum();
		System.out.println(sum);

		// Group By Length and there Sum
		Map<Integer, Integer> collect5 = list.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.summingInt(a -> a.length())));
		System.out.println(collect5);
	}

}
