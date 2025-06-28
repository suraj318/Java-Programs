package Coding;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondLargest {
	public static void main(String[] args) {
		
		Integer arr[]= {32,5,54,23,65,99,87};
		Integer largest=null;
		Integer second=null;
		
		Arrays.sort(arr,Collections.reverseOrder());
		second = arr[1];
		System.out.println(largest);
		System.out.println(second);
		
		
		
		//Using Stream
		System.out.println("------------------");
		Integer orElse = Arrays.stream(arr).distinct()
						//.boxed()
						.sorted((a,b)-> b-a)
						.skip(1)
						.findFirst()
						.orElse(null);
		System.out.println(orElse);
	}

}
