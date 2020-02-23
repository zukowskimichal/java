package pl.dev.java.essentials.other.multithreading.producerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<String> sharedQueue = new LinkedBlockingQueue<>(100);
        Producer<String> producer = new Producer<>(sharedQueue, var -> "msg" + var);
        Producer<String> producer2 = new Producer<>(sharedQueue, var -> "msg2" + var);
        Producer<String> producer3 = new Producer<>(sharedQueue, var -> "msg3" + var);
        Consumer<String> consumer1 = new Consumer<>(sharedQueue);
        Consumer<String> consumer2 = new Consumer<>(sharedQueue);
        Consumer<String> consumer3 = new Consumer<>(sharedQueue);

        producer.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

    }

}
