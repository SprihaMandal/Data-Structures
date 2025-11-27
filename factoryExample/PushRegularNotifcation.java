package factoryExample;

public class PushRegularNotifcation implements RegularNotification {

    @Override
    public void send() {
        System.out.println("Regular Notification sent through PUSH");

    }

}
