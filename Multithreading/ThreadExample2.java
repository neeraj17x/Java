package Multithreading;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("Main thread is running.");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread is running. Count: " + i);
            // pause thread for 1 second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
