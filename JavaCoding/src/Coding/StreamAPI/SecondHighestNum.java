package Coding.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNum {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10, 5, 30, 15,20);
		
		Integer orElse = nums.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.orElse(null);
		
		System.out.println(orElse);
	}

}
