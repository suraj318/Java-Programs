package Coding.DesignPatterns.FactoryPattern;

public class Main {
	public static void main(String[] args) {
		
		NotificationFactory factory = new NotificationFactory();
		
		Notification notification = factory.createNotification("sms");
		notification.notifyUser();
		
		notification = factory.createNotification("email");
		notification.notifyUser();
		
		
		// This will throw Error
		/*
		 * notification = factory.createNotification("post"); notification.notify();
		 */
		
	}

}
