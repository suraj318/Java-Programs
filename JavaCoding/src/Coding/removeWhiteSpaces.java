package Coding;

public class removeWhiteSpaces {
	public static void main(String[] args) {
		
		String name="aa tt jju nht";
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
				sb.append(name.charAt(i));
			}
		}
		System.out.println(name);
		
		System.out.println(sb.toString());
	}

}
