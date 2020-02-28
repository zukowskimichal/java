package pl.dev.java.essentials.other.multithreading;

class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new HelloRunnable(), "new thread");
        Thread thread1 = new Thread(new HelloRunnable(), "new thread1");

        thread.start();
        thread.join();

        thread1.start();
    }

}
