package Coding.DesignPatterns.FactoryPattern;

public class EmailNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending Email notification");
		
	}
}


