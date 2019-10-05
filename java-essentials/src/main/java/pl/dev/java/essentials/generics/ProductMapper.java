package pl.dev.java.essentials.generics;

import pl.dev.java.essentials.dto.ProductDto;
import pl.dev.java.essentials.dto.ProductEntity;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductMapper implements OneToOneMapper<ProductEntity, ProductDto> {

    @Override
    public ProductDto mapFrom(ProductEntity entity) {
        return null;
    }

    @Override
    public ProductEntity mapTo(ProductDto dto) {
        return null;
    }

    public List<ProductEntity> mapToEntities(List<ProductDto> dtos) {
        return dtos.stream().map(this::mapTo).collect(Collectors.toList());
    }

    public List<ProductDto> mapFromEntities(List<ProductEntity> entities) {
        return entities.stream().map(this::mapFrom).collect(Collectors.toList());
    }
}
