package threading;

public class Test {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting execution....");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Finished Execution..");
            }
        };

        Thread thread = new Thread(r, "t1");
        thread.start();
    }

}
