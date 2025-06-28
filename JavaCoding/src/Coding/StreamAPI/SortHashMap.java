package Coding.StreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {
	public static void main(String[] args) {
		Map<String, Integer> wordCount = new HashMap<>();
		wordCount.put("apple", 3);
		wordCount.put("banana", 2);
		wordCount.put("orange", 1);
		
		 LinkedHashMap<String, Integer> collect = wordCount.entrySet().stream()
						.sorted((a,b)->Integer.compare(a.getValue(), b.getValue()))
						//.sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
						.collect(Collectors.toMap(
									Map.Entry::getKey, 
									Map.Entry::getValue,
									(a,b)->a,LinkedHashMap::new));
		
		System.out.println(collect);
		
	}

}
