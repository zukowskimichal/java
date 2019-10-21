package pl.dev.java.essentials.pattern.abstractfactory.game;

import pl.dev.java.essentials.pattern.abstractfactory.AbstractFactory;

public class GameStateFactory implements AbstractFactory<GameState> {

    @Override
    public GameState create(String type) {
        if ("HOKEY".equals(type)) {
            return new HokeyState();
        }
        return null;
    }
}
