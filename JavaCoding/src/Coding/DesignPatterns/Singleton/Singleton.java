package Coding.DesignPatterns.Singleton;


public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}

	// Thread-Safe 
	public static synchronized Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void Msg() {
		System.out.println("Hello From Singleton...");
	}
}


//Using Singleton in Class
class sample{
	Singleton insta= Singleton.getInstance();
	
	public void doSometing() {
		insta.Msg();
	}
	
	public static void main(String[] args) {
		
		sample s= new sample();
		s.doSometing();
	}
}
