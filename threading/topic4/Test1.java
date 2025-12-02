package threading.topic4;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        Resource r = new Resource();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    r.increment();
                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(r.getCount());
    }
}
