package factoryExample;

public interface NotificationFactory {
    public RegularNotification createRegularNotification();

    public UrgentNotification createUrgentNotification();
}
