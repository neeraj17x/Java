package Multithreading;

public class ThreadExample4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread-1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished.");
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " is running. Counter: " + (i + 1));
                try {
                    if (threadName.equals("Thread-1")) {
                        Thread.sleep(1000);
                    } else {
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " has finished.");
        }
    }

}
