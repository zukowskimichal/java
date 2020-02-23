package pl.dev.java.essentials.other.multithreading.producerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer<T> extends Thread {

    private final BlockingQueue<T> queue;
    private final Random random = new Random();

    public Consumer(BlockingQueue<T> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {

            try {
                T msg = queue.take();
                System.out.println(Thread.currentThread()
                        .getName() + " getting message from queue " + msg.toString());
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
