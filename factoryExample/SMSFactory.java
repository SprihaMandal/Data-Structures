package factoryExample;

public class SMSFactory implements NotificationFactory {
    @Override
    public RegularNotification createRegularNotification() {
        return new SMSRegularNotification();

    }

    @Override
    public UrgentNotification createUrgentNotification() {
        return new SMSUrgentNotification();
    }

}
