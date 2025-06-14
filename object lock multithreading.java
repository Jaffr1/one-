class SharedCounter {
    private int count = 0;

    public void increment(Object lock) {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class DifferentLocksDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();

        Object lock1 = new Object();
        Object lock2 = new Object();

        // Thread 1 uses lock1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment(lock1);
            }
        });

        // Thread 2 uses lock2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment(lock2);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count (should be 200000, but likely won't be): " + counter.getCount());
    }
}