package Coding.DesignPatterns.Builder;


public class User {
	private final String name;
	private final String email;
	private final String phone;
	private final String Address;
	
	private User(UserBuilder builder) {
		this.name=builder.name;
		this.email = builder.email;
        this.phone = builder.phone;
        this.Address = builder.Address;
	}

	public static class UserBuilder {
		private final String name; // Required
		
		private String email;
		private String phone;
		private String Address;
		
		public UserBuilder(String name) {
            this.name= name;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder Address(String address) {
            this.Address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
		
	}
	
	@Override
	public String toString() {
		return "User [username=" + name + ", email=" + email + ", phone=" + phone + ", address=" + Address + "]";
	}

}
