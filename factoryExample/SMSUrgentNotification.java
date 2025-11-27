package factoryExample;

public class SMSUrgentNotification implements UrgentNotification {

    @Override
    public void send() {
        System.out.println("Urgent Notification sent through SMS");
    }

}
