package Coding;

public class Rotation {

	public static void main(String[] args) {
		
		String a="ABCD",b="CDAB";
		
		if(a.length()!=b.length()) {
			System.out.println("Not an Rotation...");
		}else {
			String c=a+a;
			if(c.contains(b)) {
				System.out.println("It is an Rotation..");
			}
		}
		
		
	}
}
