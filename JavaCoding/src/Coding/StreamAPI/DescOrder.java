package Coding.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescOrder {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10, 5, 30, 15);
		List<Integer> collect = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> collect2 = nums.stream().sorted((a, b) -> Integer.compare(a, b)).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
