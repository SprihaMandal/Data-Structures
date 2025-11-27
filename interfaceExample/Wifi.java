package interfaceExample;

public interface Wifi {

    void connectWifi();

    default void wifiTask() {
        System.out.println("wifi switched");
    }
}
