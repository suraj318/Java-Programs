package Coding.DesignPatterns.FactoryPattern;


public class SMSNotificaton implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending SMS notification");
		
	}
	
}