package threading.topic3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.*;

/*
🚚 Scenario: Delivery Warehouse – Order Processing System

You are building a warehouse system where:

Delivery Trucks bring packages to the warehouse (Producer)

Delivery Workers pick up packages and process them (Consumer)
*/
public class Warehouse {
    private final Queue<String> storage = new LinkedList<>();
    private final int capacity = 4;
    private final Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public void addPackage(String pkg) {
        lock.lock();
        try {
            while (storage.size() == capacity) {
                System.out.println("storage full -- waiting for pickup");
                notFull.await();
            }
            storage.add(pkg);
            System.out.println("Package added " + pkg);
            notEmpty.signal();

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());

        } finally {
            lock.unlock();
        }

    }

    public void removePackage() {
        lock.lock();
        try {
            while (storage.isEmpty()) {
                System.out.println("storage empty -- waiting for producer");
                notEmpty.await();
            }
            String pkg = storage.remove();
            System.out.println("Package picked up " + pkg);
            notFull.signal();

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());

        } finally {
            lock.unlock();
        }
    }

}