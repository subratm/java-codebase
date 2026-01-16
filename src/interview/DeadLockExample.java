package interview;

public class DeadLockExample {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {

        Runnable task = () -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " got lock1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + " got lock2");
                }
            }
        };

        new Thread(task, "Thread-1").start();
        new Thread(task, "Thread-2").start();
    }
}
