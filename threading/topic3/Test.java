package threading.topic3;

public class Test {

    // void prints() {

    // }

    public static void heavyAddition() {
        try {
            Thread.sleep(2000);
            System.out.println(7 + 9);
        } catch (Exception e) {

        }
    }

    public static void heavySub() {
        try {
            Thread.sleep(300);
            System.out.println(7 - 9);
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) throws Exception {
        // SharedMap sm = new SharedMap(); // one resource
        // Test t = new Test();

        // Runnable writer = new Runnable() {
        // @Override
        // public void run() {
        // sm.editData("Jane", 100);
        // }
        // };

        // Runnable writer1 = new Runnable() {
        // @Override
        // public void run() {
        // sm.editData("John", 80);
        // }
        // };

        // Runnable reader1 = new Runnable() {

        // @Override
        // public void run() {
        // int val = sm.readData("Jane");
        // System.out.println("Read data " + val);
        // }

        // };

        // Runnable reader2 = new Runnable() {

        // @Override
        // public void run() {
        // int val = sm.readData("John");
        // System.out.println("Read data " + val);

        // }

        // };

        // Thread t1 = new Thread(writer, "Writer");
        // Thread t2 = new Thread(writer1, "Writer-1");
        // Thread t3 = new Thread(reader1, "Reader-1");
        // Thread t4 = new Thread(reader2, "Reader-2");

        // t1.start();
        // t2.start();

        // t1.join(); // added this so that readers wait, else thread run together and
        // // it could never
        // // finish writing
        // t2.join();

        // t3.start();
        // t4.start();

        // new Thread(t::prints, "").start();
        Thread t1 = new Thread(() -> {
            heavyAddition();
        }, "add-thread");

        Thread t2 = new Thread(() -> {
            heavySub();
        }, "sub-thread");

        t1.start();
        t2.start();
        // t1.join();
        // t2.join();

        // heavyAddition();
        // heavySub();

    }

}
