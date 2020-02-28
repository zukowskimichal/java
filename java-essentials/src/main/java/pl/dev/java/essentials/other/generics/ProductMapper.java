package pl.dev.java.essentials.other.generics;

import pl.dev.java.essentials.other.dto.ProductDto;
import pl.dev.java.essentials.other.dto.ProductEntity;

class ProductMapper implements OneToOneMapper<ProductDto, ProductEntity> {

    public ProductEntity map(ProductDto dto) {
        return map(dto, this::innerMap);
    }

    private ProductEntity innerMap(ProductDto dto) {
        return new ProductEntity();
    }

}
