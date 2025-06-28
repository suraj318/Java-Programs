package Coding;

public class reverseString {
	public static void main(String[] args) {
		
		String name = "suraj";
		
		String rev="";
		
		
		for(int i=name.length()-1;i>=0;i--) {
			rev= rev+name.charAt(i);
		}
		
		System.out.println("Original String : "+name);
		System.out.println(name.length());
		System.out.println("Reversed String : "+rev);
		System.out.println(rev.length());
		
		//Using StringBuilder
		System.out.println("\nUsing String Builder : ");
		StringBuilder sb= new StringBuilder(name).reverse();
		
		System.out.println(sb.toString().equals(rev));
	}

}
