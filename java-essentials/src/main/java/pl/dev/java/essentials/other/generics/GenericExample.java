package pl.dev.java.essentials.other.generics;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import pl.dev.java.essentials.other.exceptions.TechnicalException;

class GenericExample {

    static <T, G> List<G> fromArrayToList(T[] array, Function<T, G> mapperFunction) {
        return Arrays.stream(array)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

    <T> List<T> fromArrayToList(T[] array) {
        return Arrays.stream(array)
                .collect(Collectors.toList());
    }

    <T extends Number> List<T> fromArrayToList(T[] array) {
        return Arrays.stream(array)
                .collect(Collectors.toList());
    }

    <T extends Number & Serializable> String convert(T t) {
        return t.toString();
    }

    List<String> getErrorMessage(List<? extends TechnicalException> exceptions) {
        return exceptions.stream()
                .map(TechnicalException::get)
                .collect(Collectors.toList());
    }

}
