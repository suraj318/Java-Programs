package Coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countWords {
	public static <R> void main(String[] args) {

		String name = "There is not an is what there is";

		HashMap<String, Integer> countWord = new LinkedHashMap<>();

		String[] let = name.toLowerCase().split("\\s+");

		for (String word : let) {
			countWord.put(word, countWord.getOrDefault(word, 0) + 1);
		}
		countWord.forEach((a, b) -> {
			System.out.println(a + " : " + b);
		});

		//Most Freq
		Entry<String, Long> orElse = Arrays.asList(name.split("\\s+")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).orElse(null);
		System.out.println(orElse);

	}

}
