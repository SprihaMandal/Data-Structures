package factoryExample;

public class Test {
    public static void main(String[] args) {
        NotificationFactory notification = new PushFactory();
        RegularNotification r = notification.createRegularNotification();
        UrgentNotification u = notification.createUrgentNotification();
        r.send();
        u.send();
        notification = new SMSFactory();
        notification.createRegularNotification().send();

    }
}
