package Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacterStream {
	
	public static void main(String[] args) {
		
		String s="aabcccffgtt";
		
		LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c-> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println("Way 1");
		System.out.println(collect.entrySet());	
		
		Character orElse = collect.entrySet().stream().filter(e-> e.getValue()==1)
		.map(Map.Entry::getKey).findFirst().orElse(null);
		
		System.out.println(orElse);
		
		System.out.println("\nWay 2");
		
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		
		for(Character c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		System.out.println(map);
		Character orElse2 = map.entrySet().stream().filter(a-> a.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(orElse2);
	}

}
