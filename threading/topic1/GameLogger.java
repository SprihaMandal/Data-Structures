package threading.topic1;

public class GameLogger implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Game Logged!");
    }

}
