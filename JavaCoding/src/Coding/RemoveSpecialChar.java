package Coding;

import java.util.stream.Collectors;

public class RemoveSpecialChar {
	public static void main(String[] args) {
		
		String str= "sdfg@#Cvbdfg%^&123";
		String special="";
		for(char c: str.toCharArray()) {
			if(!Character.isAlphabetic(c) && !Character.isDigit(c) && !Character.isWhitespace(c)) {
				special +=c;
			}
		}
		System.out.println(special);
		
		String Num = str.chars()
				.filter(Character::isDigit)
				.mapToObj(c-> String.valueOf((char) c))
				.collect(Collectors.joining(","));
		
		
		String normal= str.chars()
				.filter(a->Character.isAlphabetic(a))
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining(""));
				
				
		System.out.println(Num);
		System.out.println(normal);
	}

}
