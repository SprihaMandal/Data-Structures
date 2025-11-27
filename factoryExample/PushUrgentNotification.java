package factoryExample;

public class PushUrgentNotification implements UrgentNotification {

    @Override
    public void send() {
        System.out.println("Urgent Notification sent through PUSH");

    }

}
