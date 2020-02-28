package pl.dev.java.essentials.pattern.abstractfactory.player;

import pl.dev.java.essentials.pattern.abstractfactory.AbstractFactory;

public class PlayerStatisticsFactory implements AbstractFactory<PlayerStatistic> {

    @Override
    public PlayerStatistic create(String type) {
        return null;
    }
}
