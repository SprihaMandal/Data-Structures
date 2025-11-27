package interfaceExample;

public class Room {

    public static void main(String[] args) {
        Light light = new Light();
        Printer printer = new Printer();
        light.task();
        light.turnOff();
        printer.connectWifi();
        printer.wifiTask();
        printer.task();
        printer.turnOff();
        printer.turnOn();
        Switchable colorLight = new Switchable() {
            @Override
            public void turnOff() {
                System.out.println("Green light switched off..");

            };

            @Override
            public void turnOn() {
                System.out.println("Green light switched on..");

            };

            @Override
            public void task() {
                System.out.println("Green light switch");

            }
        };
        colorLight.task();
        colorLight.turnOff();
    }

}
