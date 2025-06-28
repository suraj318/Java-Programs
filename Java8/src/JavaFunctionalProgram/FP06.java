package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP06 {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList( 1,12, 4,4, 5, 6, 8,1,  45);
		List<String> str = List.of("Spring","Springboot","API","AWS","Java","Docker","Microservices");

		List<Integer> doubleNum = doublenum(nums);
		List<Integer> evenNum=evennum(nums);//Create a List with Even Nums Filtered from Number List
		
		List<Integer> lenTitle=lentitle(str);
		
		System.out.println(nums);
		System.out.println(doubleNum);
		System.out.println(evenNum);
		System.out.println(lenTitle);
		
		
	}

	private static List<Integer> lentitle(List<String> str) {
		return str.stream()
				.map(a->a.length())
				.collect(Collectors.toList());
	}

	private static List<Integer> evennum(List<Integer> nums) {
		return nums.stream()
				.filter(a->a%2==0)
				.collect(Collectors.toList());
	}

	private static List<Integer> doublenum(List<Integer> nums) {
		return nums.stream()
				.map(a->a*a)
				.collect(Collectors.toList());
	}

}
