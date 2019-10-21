package pl.dev.java.essentials.pattern.abstractfactory;

import pl.dev.java.essentials.pattern.abstractfactory.game.GameStateFactory;
import pl.dev.java.essentials.pattern.abstractfactory.player.PlayerStatisticsFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factoryType) {
        if ("GAME_STATE".equals(factoryType)) {
            return new GameStateFactory();
        } else if ("PLAYER_STATISTICS".equals(factoryType)) {
            return new PlayerStatisticsFactory();
        }
        return null;
    }
}
