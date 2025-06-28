package Coding.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
	public static void main(String[] args) {
		
		
		List<String> list=Arrays.asList("Hello","How","Are","You");
		
		//ForEach
		list.forEach(System.out::print);
		System.out.println();
		
		//Collect
		Double collect = list.stream().collect(Collectors.averagingInt(String::length));
		System.out.println(collect);
		
		//reduce
		String reduce = list.stream().reduce((a,b)->a +" - "+b).orElse(null);
		System.out.println(reduce);
		
		//count
		long count = list.stream().count();
		System.out.println(count);
		
		//findFirst
		String findFirst = list.stream().filter(a->a.length()==3).findFirst().orElse("");
		System.out.println(findFirst);
		
		//findAny
		String findAny = list.stream().filter(a->a.length()==3).findAny().orElse("");
		System.out.println(findAny);
		
		//noneMatch
		
		//allMatch
		boolean allMatch = list.stream().filter(a->a.length()>3).allMatch(a->a.contains("e"));
		System.out.println(allMatch);
		//anyMatch
		//list.stream().filter(null)
		
		
		
				
	}

}
