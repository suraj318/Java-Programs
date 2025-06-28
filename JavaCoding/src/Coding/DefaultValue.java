package Coding;

import java.util.Optional;

public class DefaultValue {

	public void defaultValue(Optional<String> name) {
		String value = name.orElse("Kkkkk");
		System.out.println("This is : "+value);
	}
	
	public static void main(String [] args) {
		
		DefaultValue d= new DefaultValue();
		d.defaultValue(Optional.of("Suraj"));
		d.defaultValue(Optional.empty());
	}
}
