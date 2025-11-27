package factoryExample;

public class EmailFactory implements NotificationFactory {

    @Override
    public RegularNotification createRegularNotification() {
        return new EmailRegularNotification();
    }

    @Override
    public UrgentNotification createUrgentNotification() {
        return new EmailUrgentNotification();
    }

}
