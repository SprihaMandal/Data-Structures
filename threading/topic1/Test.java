package threading.topic1;

public class Test {
    public static void main(String[] args) {
        EmailSender e = new EmailSender();
        EmailJobRunner morningMail = new EmailJobRunner(e);
        Thread jobStarter = new Thread(morningMail, "starter");
        jobStarter.start();

        GameLogger gl = new GameLogger();
        Thread gameLoggerWorker1 = new Thread(gl, "gameLoggerWorker1");
        Thread gameLoggerWorker2 = new Thread(gl, "gameLoggerWorker2");

        gameLoggerWorker1.start();
        gameLoggerWorker2.start();
        Thread myThread = new MyThread(gl, "my-personal-thread");
        myThread.start();

    }

}

class MyThread extends Thread {
    MyThread(Runnable r, String name) {
        super(r, name);
    }

    // @Override
    // public void run() {
    // System.out.println(Thread.currentThread().getName());
    // }

}
