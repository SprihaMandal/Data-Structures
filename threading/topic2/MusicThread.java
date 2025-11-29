package threading.topic2;

public class MusicThread extends Thread {

    private boolean paused = false;
    private boolean stopped = false;
    private final Object lock = new Object();

    @Override
    public void run() {
        try {
            while (!stopped) {
                /*
                 * PAUSE HANDLING:
                 * If 'paused' is true, the thread enters WAITING state by calling lock.wait()
                 * WAITING releases the lock and puts this thread into the lock's wait queue.
                 */
                synchronized (lock) {
                    while (paused) {
                        System.out.println("State before WAITING: " + getState());
                        lock.wait(); // Thread goes to WAITING state
                    }
                }

                /*
                 * RUNNABLE STATE:
                 * Thread is actively executing music logic.
                 */
                System.out.println("Music playing... Thread State: " + getState());

                /*
                 * TIMED_WAITING STATE:
                 * Thread.sleep() causes TIMED_WAITING.
                 * Here the thread simulates "playing music" for 2 seconds.
                 */
                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {
            System.out.println("Music Thread interrupted");
        }

        /*
         * TERMINATED STATE:
         * Loop ends => thread completes run() => goes to TERMINATED.
         */
        System.out.println("Music stopped → TERMINATED");
    }

    public void pauseMusic() {
        paused = true;
        System.out.println("Music paused. Thread state from main: " + getState());
    }

    // Resume music by notifying the waiting thread
    public void resumeMusic() {
        synchronized (lock) {
            paused = false; // allow thread to continue
            lock.notify(); // wake one waiting thread (WAITING → BLOCKED → RUNNABLE)
        }
        System.out.println("Music resumed. Thread state from main: " + getState());
    }

    // Stop the music thread completely
    public void stopMusic() {
        stopped = true;
        synchronized (lock) {
            paused = false; // ensure loop can exit
            lock.notify(); // wake waiting thread so it can exit
        }
        System.out.println("Stopping music... Thread state: " + getState());
    }
}
