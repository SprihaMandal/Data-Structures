package factoryExample;

public class PushFactory implements NotificationFactory {

    @Override
    public RegularNotification createRegularNotification() {
        return new PushRegularNotifcation();
    }

    @Override
    public UrgentNotification createUrgentNotification() {
        return new PushUrgentNotification();
    }

}
