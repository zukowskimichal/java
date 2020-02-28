package pl.dev.java.essentials.other.multithreading.producerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.function.Function;

class Producer<T> extends Thread {

    private final BlockingQueue<T> queue;
    private final Random random = new Random();
    private final Function<String, T> msgCreator;
    private int counter = 0;

    Producer(BlockingQueue<T> queue, Function<String, T> msgCreator) {
        this.queue = queue;
        this.msgCreator = msgCreator;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (true) {

            T msg = msgCreator.apply(" " + random.nextInt(1000));
            long currentTime = System.currentTimeMillis();
            long timePass = currentTime - startTime;
            System.out.println(Thread.currentThread()
                    .getName() + " producing message to queue " + msg.toString()
                    + " queue size " + queue.size()
                    + " msg produced " + counter
                    + " throughput " + (double) counter * 1000 / timePass + " msg/s");
            try {
                queue.put(msg);
                counter++;
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
