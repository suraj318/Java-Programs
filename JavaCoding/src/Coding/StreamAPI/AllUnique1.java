package Coding.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AllUnique1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(20,10, 5, 30, 15, 10);
		List<String> list=Arrays.asList("aaa","bbascb","uuuc","dd","ozxadoo","ccacadc");

		boolean unique = nums.stream().distinct().count() == nums.size();
		System.out.println(unique);

		nums.stream().sorted((a, b) -> Integer.compare(b, a)).forEach(System.out::print);
		System.out.println();
		list.stream().sorted(Comparator.comparingInt(a->a.length())).forEach(System.out::print);

		System.out.println();

		List<Integer> drop = nums.stream().dropWhile(a -> a % 2 == 0).collect(Collectors.toList());
		System.out.println(drop);

		List<Integer> take = nums.stream().takeWhile(a -> a % 2 == 0).collect(Collectors.toList());
		System.out.println(take);
		
		Integer reduce = nums.stream().reduce((a,b)->a+b).get();
		int sum = nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		System.out.println(reduce);
	}

}
