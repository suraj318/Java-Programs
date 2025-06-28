package Coding;

import java.util.List;

public class ReduceWithInteger {
	public static void main(String[] args) {

		List<Integer> list = List.of(2, 4, 5, 6, 7, 8, 9);

		// SUM
		int sum = list.stream().mapToInt(Integer::intValue).reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		int sum2 = list.stream().mapToInt(Integer::intValue).reduce(Integer::sum).orElse(0);
		System.out.println(sum2);

		// . Product of All Numbers
		Integer reduce = list.stream().reduce(1, (a, b) -> a * b);
		System.out.println(reduce);

		// Find Maximum Number
		Integer max = list.stream().reduce(Integer::max).orElse(0);
		System.out.println(max);

		// Find Minimum Number
		Integer min = list.stream().reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println(min);

		// Difference of All Numbers (Left to Right)

		Integer orElse = list.stream().reduce((a, b) -> a - b).orElse(0);
		System.out.println(orElse);

		// Custom Reduce: Sum of Squares
		Integer orElse2 = list.stream().reduce(0, (a, b) -> a + b * b);
		System.out.println(orElse2);
	}

}
