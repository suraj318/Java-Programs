package Coding.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class operations {
	public static void reverse(List<String> list, List<Integer> num) {

		list.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder())
				.forEach(a -> System.out.print(a + " "));
		System.out.println();
		num.stream().sorted((a, b) -> Integer.compare(b, a)).forEach(System.out::println);
	}

	public static void lengthDemo(List<String> list) {
		list.stream().filter(a -> a.length() > 5).forEach(System.out::println);
	}

	public static void SortByLength(List<String> list) {
		list.stream().sorted((a, b) -> Integer.compare(b.length(), a.length())).forEach(System.out::println);
	}

	public static void RemoveDup(List<String> list) {

		list.stream().distinct().forEach(System.out::println);
		/*
		 * Long collect = list.stream().distinct().collect(Collectors.counting());
		 * System.out.println(collect);
		 */
	}

	public static void EntryGtrThan1(List<String> list) {
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(a -> a.getValue() > 2).map(Map.Entry::getKey).forEach(System.out::println);
		// System.out.println(collect);
	}

	public static void ListContainsChar(List<String> list, String c) {
		list.stream().filter(str -> str.contains(c)).forEach(System.out::println);

	}

	public static void RemoveWordStartWith(List<String> list, String s) {

		list.stream().filter(a -> !a.startsWith(s)).forEach(System.out::println);
	}

	public static void longestWord(List<String> list) {

		String max = list.stream().max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println(max);
	}

	public static void ShortestWord(List<String> list) {

		Optional<String> min = list.stream().min(Comparator.comparingInt(String::length));
		System.out.println(min.get());
	}

	public static void ContainsVowels(List<String> list) {
		list.stream().filter(a -> a.matches(".*[aeiouAEIOU].*")).forEach(System.out::println);
	}

	public static void SeparatedByComma(List<String> list) {

		String string = list.stream().collect(Collectors.joining(",")).toString();
		System.out.println(string);
	}

	public static void reverseIntoNewList(List<String> list) {
		list.stream().map(a -> new StringBuilder(a).reverse()).forEach(System.out::println);
	}

	public static void ManupilateString(String str) {

		String collect = str.chars().mapToObj(a -> "" + (char) a + (char) a)
				.collect(Collectors.joining("-", " qwe ", " xdv"));
		System.out.println(collect);
	}
	
	public static void findDup(List<Integer> num) {
		Set<Integer> seen=new HashSet<>();
		Set<Integer> dup=new HashSet<>();
		
		for(Integer a: num) {
			if(!seen.add(a)) {
				dup.add(a);
			}
		}
		System.out.println(dup);
	}
}

public class StringToUpperAndSort {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "banana", "mango", "cherry", "pineapple", "watermelon", "pea",
				"mango");
		List<String> list2 = Arrays.asList("sky", "try", "kiwi", "myth");
		List<Integer> num = Arrays.asList(1, 4, 6, 8, 9, 5, 3, 12, 45, 7, 9);

		// operations.reverse(list,num);
		// operations.lengthDemo(list);
		// operations.SortByLength(list);
		// operations.RemoveDup(list);
		// operations.EntryGtrThan1(list);
		// operations.ListContainsChar(list, "m");
		// operations.RemoveWordStartWith(list, "m");
		// operations.longestWord(list);
		// operations.ShortestWord(list);
		// operations.ContainsVowels(list2);
		// operations.SeparatedByComma(list);
		// operations.reverseIntoNewList(list);

		// operations.ManupilateString("abc");
		
		operations.findDup(num);
	}

}
