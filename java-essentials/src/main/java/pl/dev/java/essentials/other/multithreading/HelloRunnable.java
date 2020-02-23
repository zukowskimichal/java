package pl.dev.java.essentials.other.multithreading;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello runnable");
    }
}
