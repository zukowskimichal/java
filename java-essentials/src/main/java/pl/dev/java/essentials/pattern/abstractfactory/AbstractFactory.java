package pl.dev.java.essentials.pattern.abstractfactory;

public interface AbstractFactory<T> {
    T create(String type);
}
