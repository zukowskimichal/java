package pl.dev.java.essentials.other.multithreading;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.springframework.util.CollectionUtils;

public class BlockingQueue {

    private List<Object> queue = new LinkedList<>();
    private int limit;

    public void add(Object o) {
        queue.add(o);
    }

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public int remainingCapacity() {
        return limit - queue.size();
    }

    public synchronized void enqueue(Object item) throws InterruptedException {
        while (queue.size() == limit) {
            wait();
        }
        if (CollectionUtils.isEmpty(queue)) {
            notifyAll();
        }
        queue.add(item);
    }

    public synchronized Object dequeue() throws InterruptedException {
        while (CollectionUtils.isEmpty(queue)) {
            wait();
        }
        if (queue.size() == limit) {
            notifyAll();
        }
        return queue.remove(0);
    }

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue(10);

        Thread producer = new Thread(() -> {
            Random random = new Random();
            while (true) {
                String msg = "producerMsg" + random.nextInt(10000);
                try {
                    blockingQueue.enqueue(msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread: " + Thread.currentThread()
                        .getName() + " enquining " + msg + " remaining capacity " + blockingQueue.remainingCapacity());
            }
        });
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    Object msg = blockingQueue.dequeue();
                    System.out.println("Message dequeue: " + msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
