package interfaceExample;

public class Printer implements Switchable, Wifi {

    @Override
    public void connectWifi() {
        System.out.println("wifi connected to printer");
    }

    @Override
    public void turnOff() {
        System.out.println("printer off");
    }

    @Override
    public void turnOn() {
        System.out.println("printer on");
    }

}
