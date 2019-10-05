package pl.dev.java.essentials.generics;

import com.sun.org.apache.xpath.internal.objects.XNumber;
import groovy.grape.GrapeIvy;
import pl.dev.java.essentials.exceptions.TechnicalException;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericExample {

    public <T> List<T> fromArrayToList(T[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static <T, G> List<G> fromArrayToList(T[] array, Function<T, G> mapperFunction) {
        return Arrays.stream(array).map(mapperFunction).collect(Collectors.toList());
    }

    public <T extends Number> List<T> fromArrayToList(T[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public <T extends Number & Serializable> String convert(T t) {
        return t.toString();
    }

    public List<String> getErrorMessage(List<? extends TechnicalException> exceptions) {
        return exceptions.stream().map(TechnicalException::get).collect(Collectors.toList());
    }


}