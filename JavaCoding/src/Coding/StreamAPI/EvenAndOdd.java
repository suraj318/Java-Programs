package Coding.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenAndOdd {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6,2,4,4,4);
		
		Map<Boolean, List<Integer>> collect = list.stream()
			.collect(Collectors.partitioningBy(a->a%2==0));
		
		System.out.println(collect.get(true));
		System.out.println(collect.get(false));
		//List<Integer> list2 = collect.get(true);
		
	
		Map<Integer, Long> collect2 = list.stream().filter(a->a%2==0).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect2);
	}

}
