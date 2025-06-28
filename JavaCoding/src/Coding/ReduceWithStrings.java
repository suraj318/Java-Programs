package Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReduceWithStrings {
	public static void main(String[] args) {
		List<String> str=Arrays.asList("Java","Programming","Language");
		
		String reduce = str.stream()
			.reduce("",(a,b)->a+" "+b).repeat(3).trim();
		System.out.println(reduce);
		
		Map<String, Integer> collect = str.stream()
			.collect(Collectors.toMap(a->a, a->a.length()));
		collect.forEach((a,b)-> {
			System.out.println(a +" : "+b);
		});
		
		
		//Way 1 : Sum
		Integer su= str.stream()
			.reduce(0,(sum,word)->sum+word.length(),Integer::sum);
		System.out.println(su);
		
		//Way 2 : Sum
		int sum = str.stream()
			.mapToInt(String::length)
			.sum();
		System.out.println(sum);
		
		System.out.println("----------------------------------------------------------");
		List<String> str2=Arrays.asList("Java","Programming","Language","JAVA","HELLO");
		
		//Concatenate Only Uppercase Words
		String reduce2 = str2.stream()
			.filter(a->a.equals(a.toUpperCase()))
			.reduce("",(a,b)->a+b);
		System.out.println(reduce2);
		
		
		//Longest Word
		String reduce3 = str2.stream()
			.reduce((a,b)-> a.length()>b.length()? a:b).orElse("");
		System.out.println(reduce3);
		
		// Reduce to Reverse All Strings
		String reduce4 = str.stream()
			.reduce("",(a,b)->new StringBuilder(b).reverse().toString()+a);
		System.out.println(reduce4);
		
		//Palindrome
		String sample="madam";
		
		boolean equalsIgnoreCase = sample.equalsIgnoreCase(new StringBuilder(sample).reverse().toString());
		System.out.println(equalsIgnoreCase);
		
		
		
	}

}
