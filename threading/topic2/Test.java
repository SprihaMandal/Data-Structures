package threading.topic2;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        // NEW state
        MusicThread musicThread = new MusicThread();
        System.out.println("Initial State (NEW): " + musicThread.getState());

        // RUNNABLE state
        musicThread.start();
        Thread.sleep(500); // Let it start
        System.out.println("After start (RUNNABLE): " + musicThread.getState());

        musicThread.resumeMusic();

        // Pause → WAITING
        musicThread.pauseMusic();
        Thread.sleep(1000);
        System.out.println("State after pause = should be WAITING: " + musicThread.getState());

        // Resume → RUNNABLE
        musicThread.resumeMusic();
        Thread.sleep(1000);
        System.out.println("State after resume again " + musicThread.getState());

        // Stop → TERMINATED
        musicThread.stopMusic();
        musicThread.join(); // Wait for it to end
        System.out.println("Final State (TERMINATED): " + musicThread.getState());
    }
}
