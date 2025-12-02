package threading.topic4;

public class Resource {
    private int count = 0;
    // private Object lock = new Object();

    synchronized void increment() {
        count++;
    }

    int getCount() {
        return count;
    }
}
