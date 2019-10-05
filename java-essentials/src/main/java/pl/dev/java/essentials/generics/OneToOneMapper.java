package pl.dev.java.essentials.generics;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface OneToOneMapper<T, G> {

    G mapFrom(T entity);
    T mapTo(G dto);

    default List<T> mapToList(List<G> dtos) {
        return dtos.stream().map(this::mapTo).collect(Collectors.toList());
    }
}
