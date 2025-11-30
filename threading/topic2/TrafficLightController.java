package threading.topic2;

public class TrafficLightController extends Thread {
    private boolean paused = false;
    private boolean stopped = false;

    private Object lock = new Object();

    @Override
    public void run() {
        try {
            while (!stopped) {

                synchronized (lock) { // adding sync here because need to use wait over a certain condition
                    while (paused) {
                        System.out.println("Traffic Light paused");
                        lock.wait();
                    }
                }
                Thread.sleep(1000);
                System.out.println("RED");
                checkStop();

                checkPause();

                Thread.sleep(2000);
                System.out.println("GREEN");
                checkStop();
                checkPause();
                Thread.sleep(1000);
                System.out.println("YELLOW");
                checkStop();

                checkPause();

            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    void pauseLight() {
        paused = true;
    }

    void resumeLight() {
        // need to use notify to remove thread from wait set
        synchronized (lock) {
            paused = false; // paused inside synchronised i.e putting synchronised
            lock.notify();
            System.out.println("Traffic Light Resumed");
        }
    }

    void stopLight() {
        stopped = true;
        synchronized (lock) {
            paused = false;
            lock.notify();
            System.out.println("Traffic Light Stopped");
        }
    }

    private void checkPause() throws InterruptedException {
        synchronized (lock) {
            while (paused) {
                System.out.println("Traffic Light is WAITING...");
                lock.wait(); // WAITING state
            }
        }
    }

    private void checkStop() {
        if (stopped) {
            System.out.println("Stop detected! Preparing to exit...");
            return; // caller must break loop
        }
    }

}
