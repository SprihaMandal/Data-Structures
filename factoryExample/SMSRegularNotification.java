package factoryExample;

public class SMSRegularNotification implements RegularNotification {

    @Override
    public void send() {
        System.out.println("Regular Notification sent through SMS");
    }

}
