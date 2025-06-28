package Coding.StreamAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquareOfEven {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		int sum = list.stream()
			.filter(a->a%2==0)
			.mapToInt(a->a*a)
			.sum();
		System.out.println(sum);
		
		long collect = list.stream().collect(Collectors.summarizingInt(n->n)).getSum();
		System.out.println(collect);
	}

}
