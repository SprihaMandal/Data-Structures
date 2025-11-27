package factoryExample;

public class EmailUrgentNotification implements UrgentNotification {
    @Override
    public void send() {
        System.out.println("Urgent Notification sent through Email");

    }

}
