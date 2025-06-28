package Coding.DesignPatterns.FactoryPattern;

public class NotificationFactory {

	
	public Notification createNotification(String type) {
		if(type ==null || type.isEmpty()) {
			return null;
		}
		
		switch(type.toLowerCase()) {
		case "sms" : return new SMSNotificaton();
		case "email" : return new EmailNotification();
		case "push" : return new PushNotificaton();
		
		default:
			throw new IllegalArgumentException("Unknown Type...");
		}
	}
}
