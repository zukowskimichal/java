package pl.dev.java.essentials.other.multithreading.philosophers;

 class DinningPhilosophers {

    public static void main(String[] args) {
        Object fork1 = new Object();
        Object fork2 = new Object();
        Object fork3 = new Object();
        Object fork4 = new Object();
        Object fork5 = new Object();

        Thread philosopher1 = new PhilosopherLeft(fork1, fork2);
        Thread philosopher2 =  new PhilosopherLeft(fork3, fork2);
        Thread philosopher3 =  new PhilosopherLeft(fork3, fork4);
        Thread philosopher4 =  new PhilosopherLeft(fork4, fork5);
        Thread philosopher5 =  new PhilosopherLeft(fork5, fork1);

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
    }

}
