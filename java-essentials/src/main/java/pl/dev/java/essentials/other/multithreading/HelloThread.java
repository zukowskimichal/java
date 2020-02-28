package pl.dev.java.essentials.other.multithreading;

class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread name:" + getName() + " Hello thread");
    }

}
