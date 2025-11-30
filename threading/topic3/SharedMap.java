package threading.topic3;

import java.util.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedMap {
    private final Map<String, Integer> map = new HashMap<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock(true);

    int readData(String key) {
        /*
         * if the lock acquisition fails (e.g., throws an exception) and you put
         * the lock inside the try, then the finally block will still try to unlock
         * a lock that was never acquired which will throw illegal monitor exception
         */
        lock.readLock().lock();
        try {
            return map.getOrDefault(key, -1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;

        } finally {
            lock.readLock().unlock();
        }
    }

    void editData(String key, int value) {
        lock.writeLock().lock();
        try {
            map.put(key, value);
        } finally {
            lock.writeLock().unlock();
        }
    }

}
