package pl.dev.java.essentials.pattern.eventListener.basic;

import java.util.ArrayList;
import java.util.List;

class Initializer {

    private List<EventListener> eventListeners = new ArrayList<>();

    void addListener(EventListener eventListener) {
        eventListeners.add(eventListener);
    }

    void sendEvent(String eventVar) {
        System.out.println("Received msg" + eventVar);
        eventListeners.forEach(eventListener -> eventListener.eventOccurred(eventVar));
    }

}
