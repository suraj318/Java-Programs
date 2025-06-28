package Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateValue {

	public static void main(String[] args) {
		/*
		 * List<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,3,4,5,6,7,1));
		 * List<Integer> dup= new ArrayList<>();
		 */

		int[] arr = { 1, 2, 3, 3, 4, 5, 6, 7, 1 };

		Set<Integer> seen = new HashSet<>();
		Set<Integer> dup = new HashSet<>();

		for (int num : arr) {
			if (!seen.add(num)) {
				dup.add(num);
			}
		}

		dup.forEach(a -> {
			System.out.println(a);
		});

		// Using Stream

		System.out.println();

		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(a -> a.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);

	}

}
