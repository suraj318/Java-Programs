package Coding;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {

		String s1 = "listen", s2 = "silent";

		if (s1.length() != s2.length()) {
			System.out.println("Not Anagrams");

		}

		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		System.out.println(Arrays.equals(c1, c2));

	}

}
