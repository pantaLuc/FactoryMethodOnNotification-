package ProductCreator;

import ConcreteProduct.NotificationFactory;
import Notificationcreator.Notification;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
