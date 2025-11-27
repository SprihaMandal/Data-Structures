package factoryExample;

public class EmailRegularNotification implements RegularNotification {

    @Override
    public void send() {
        System.out.println("Regular Notification sent through Email");

    }

}
