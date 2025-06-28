package Coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countLetters {
	public static void main(String[] args) {
		
		String name = "aabbc";
		
		
		
		HashMap<Character, Integer> count= new LinkedHashMap<>();
		HashMap<String, Integer> strCount= new LinkedHashMap<>();
		String str="This this is what this is";
		String[] a=str.split(" ");
		
		for(String sa:a) {
			strCount.put(sa, strCount.getOrDefault(sa,0)+1);
		}
		strCount.forEach((v,b)->{
			System.out.println(v +" "+b);
		});
			
		for(Character c : name.toCharArray()) {
			count.put(c, count.getOrDefault(c,0)+1);
		}
		System.out.println(count);
		
		
		Character first = name.chars().mapToObj(aar-> (char) aar)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(aa-> aa.getValue()==1)	
				.map(Map.Entry::getKey).findAny().get();
		System.out.println(first);
		
		
	}

}
