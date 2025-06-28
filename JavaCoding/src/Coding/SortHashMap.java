package Coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
        map.put("banana", 2);
        map.put("apple", 5);
        map.put("orange", 3);
        
        
        LinkedHashMap<String, Integer> collect = map.entrySet().stream()
        	.sorted(Map.Entry.comparingByKey())
        	.collect(Collectors.toMap(Map.Entry::getKey, 
        							Map.Entry::getValue,
        							(a,b)->a,
        							LinkedHashMap::new));
        
        System.out.println(collect);
        
        LinkedHashMap<String, Integer> collectValue = map.entrySet().stream()
            	.sorted(Map.Entry.comparingByValue())
            	.collect(Collectors.toMap(Map.Entry::getKey, 
            							Map.Entry::getValue,
            							(a,b)->a,
            							LinkedHashMap::new));
        System.out.println(collectValue);
	}
	
	

}
