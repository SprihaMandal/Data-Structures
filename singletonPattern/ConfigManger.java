package singletonPattern;

public class ConfigManger {

    private ConfigManger() {
    }

    private static class ConfigManagerHelper {
        private static final ConfigManger INSTANCE = new ConfigManger();
    }

    public static ConfigManger getInstance() {
        return ConfigManagerHelper.INSTANCE;
    }

    public String getApiKey() {
        return "APIKEY";
    }

    public String getDBURL() {
        return "https:://prod-sula.db.cms.com";
    }

    public void connectDB(String dbURL) {
        System.out.println("Connecting DB....." + dbURL);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
            Thread.currentThread().interrupt();
        }
        System.out.println("Connected DB!!");

    }

}
