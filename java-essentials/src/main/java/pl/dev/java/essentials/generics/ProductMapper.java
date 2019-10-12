package pl.dev.java.essentials.generics;

import pl.dev.java.essentials.dto.ProductDto;
import pl.dev.java.essentials.dto.ProductEntity;

public class ProductMapper implements OneToOneMapper<ProductDto, ProductEntity> {

    @Override
    public ProductEntity mapFrom(ProductDto entity) {
        return null;
    }

    @Override
    public ProductDto mapTo(ProductEntity dto) {
        return null;
    }


    public ProductEntity map(ProductDto dto) {
        return map(dto, this::innerMap);
    }

    private ProductEntity innerMap(ProductDto dto) {
        return new ProductEntity();
    }


}
