package Coding.DesignPatterns.Builder;

public class BuilderPatternExample {
	public static void main(String[] args) {
		
		User user1= new User.UserBuilder("Suraj")
				.Address("Pune/Maharashtra").build();
		
		User user2= new User.UserBuilder("Mayur").email("mayur@gmail.com").phone("2345678").build();
		
		System.out.println(user1);
		System.out.println(user2);
	}

}
