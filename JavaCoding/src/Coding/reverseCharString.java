package Coding;

public class reverseCharString {
	public static void reverse(char[] s) {
		
		StringBuilder sb= new StringBuilder();
		for(int i=s.length-1;i>=0;i--) {
			sb.append(s[i]);
		}
		
		for(int i=0;i<s.length;i++) {
			s[i]=sb.charAt(i);
		}
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		char[] s= {'h','e','l','l','o'};
		reverse(s);
	}

}
