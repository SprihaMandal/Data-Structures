package interfaceExample;

public class Light implements Switchable {

    @Override
    public void turnOff() {
        System.out.println("Turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("Turned on");
    }

}
