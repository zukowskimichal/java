package pl.dev.java.essentials.pattern.eventListener.basic;

public class Test {

    public static void main(String[] args) {
        Initializer initializer = new Initializer();
        Responder responder = new Responder();
        initializer.addListener(responder);
        initializer.sendEvent("event");
    }
}
