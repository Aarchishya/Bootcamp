package org.example;
//The factory design pattern says that define an interface ( A java interface or an abstract class)
// for creating object and let the subclasses decide which class to instantiate.

interface Notification {
    void notifyUsers();
}
class SMSNotification implements Notification
{
    @Override
    public void notifyUsers() {
        System.out.println("Hi I am a SMS Notification");
    }
}
class EmailNotification implements Notification
{
    @Override
    public void notifyUsers() {
        System.out.println("Hi I am a Email Notification");
    }
}
class TelegramNotification implements Notification
{
    @Override
    public void notifyUsers() {
        System.out.println("Hi I am a telegram Notification");
    }
}
class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "TELEGRAM":
                return new TelegramNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}


public class FactoryDesignPattern {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUsers();

        Notification notification1 = notificationFactory.createNotification("EMAIL");
        notification1.notifyUsers();
    }

}
