package pl.dev.java.essentials.other.generics;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

interface OneToOneMapper<T, G> {

    G map(T t);

    default G map(T t, Function<T, G> map) {
        return map.apply(t);
    }

    default List<G> mapToList(List<T> t) {
        return t.stream()
                .map(this::map)
                .collect(Collectors.toList());
    }
}
