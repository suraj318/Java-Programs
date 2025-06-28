package Coding.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


class test implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		//o1.compareTo(o2);
		return Integer.compare(o1, o2);
	}

	
}
public class FindMaxWord {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "pea","orange", "banana", "apple","watermelon");
		
		Optional<String> max = words.stream()
			.max(Comparator.comparingInt(String::length));
		System.out.println(max.get());
		
		
		String string = words.stream().max((a,b)->Integer.compare(b.length(), a.length())).get();
		System.out.println(string);
		
		List<Integer> list=Arrays.asList(1,4,6,8,9,6,5,4,3,2,46,7,9);
		
		Collections.sort(list,new test());
		System.out.println(list);
	}

}
