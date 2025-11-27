package singletonPattern;

public class Test {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.appLogger();

        ConfigManger config = ConfigManger.getInstance();
        String dbUrl = config.getDBURL();
        config.connectDB(dbUrl);
    }

}
