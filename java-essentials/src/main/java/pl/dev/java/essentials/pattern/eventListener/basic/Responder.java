package pl.dev.java.essentials.pattern.eventListener.basic;

public class Responder implements EventListener {

    @Override
    public void eventOccurred(String eventVar) {
        System.out.println("event occurred: " + eventVar);
    }
}
