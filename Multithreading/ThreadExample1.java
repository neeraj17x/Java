package Multithreading;

public class ThreadExample1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("Main thread is running.");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("New thread is running.");
    }

}
