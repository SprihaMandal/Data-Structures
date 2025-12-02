package threading.topic3;

public class Shop {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    int boxNum = i + 1;
                    warehouse.addPackage("Box-" + boxNum);
                    Thread.sleep(1000);

                }
            } catch (Exception e) {

            }
        }, "producer-thread");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 2; i++) {
                    warehouse.removePackage();
                    Thread.sleep(3000);

                }
            } catch (Exception e) {

            }
        }, "consumer-thread");
        

        producer.start();
        consumer.start();

    }

}
