package pl.dev.java.essentials.other.multithreading.philosophers;

import java.util.Random;

class PhilosopherLeft extends Thread {

    private final Object rightFork;
    private final Object leftFork;
    private int food = 100;
    private final Random random = new Random();

    PhilosopherLeft(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (food > 0) {
            action("thinking");
            synchronized (leftFork) {
                action("picked up leftFork");
                synchronized (rightFork) {
                    action("picked up rightFork");
                    action("eat", 1000);
                    this.food -= 1;
                }
                action("put down rightFork");
            }
            action("put down leftFork");
        }
    }

    private void action(String actionName) {
        try {
            System.out.println("Philosopher " + Thread.currentThread()
                    .getName() + " " + actionName);
            Thread.sleep(random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void action(String actionName, int delayRange) {
        try {
            System.out.println("Philosopher " + Thread.currentThread()
                    .getName() + " " + actionName);
            Thread.sleep(random.nextInt(delayRange));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
