package interfaceExample;

public interface Switchable {
    void turnOff();

    void turnOn();

    default void task() {
        System.out.println("Switch function");
    }
}
