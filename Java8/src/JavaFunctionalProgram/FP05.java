package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.Optional;
//import java.util.stream.Stream;

public class FP05 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList( 1,12, 4,4, 5, 6, 8,1,  45);
		List<String> str = List.of("Spring","Springboot","API","AWS","Java","Docker","Microservices");

		
		distinctNum(nums);System.out.println(" ");
		sortedNum(nums,str);
		reverseNum(nums);
		
	}

	private static void reverseNum(List<Integer> nums) {
		System.out.print("reverseNum : ");
		nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println("\nAsc Order : ");
		nums.stream().sorted().forEach(System.out::print);
	}

	private static void sortedNum(List<Integer> nums, List<String> str) {
		System.out.print("sortedNum : ");
		nums.stream().sorted().forEach(System.out::print);
		System.out.println(" ");
		str.stream().sorted().forEach(System.out::println);
	}

	private static void distinctNum(List<Integer> nums) {
		System.out.print("distinctNum : ");
		nums.stream().distinct().forEach(System.out::print);
		
	}

}
