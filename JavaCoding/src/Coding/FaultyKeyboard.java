package Coding;


/*Your laptop keyboard is faulty, and whenever
you type a character 'i' on it, it reverses the string that you have written. 
Typing other characters works as expected.

Input: s = "string"
Output: "rtsng"*/

public class FaultyKeyboard {
	
	public static void reverse(String s) {
		StringBuilder sb= new StringBuilder();
		
		for(Character c: s.toCharArray()) {
			if(c=='i') {
				sb.reverse();
			}else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString().toLowerCase());
	}
	
	public static void main(String[] args) {
		
		String s= "String";
		reverse(s);
	}
}
