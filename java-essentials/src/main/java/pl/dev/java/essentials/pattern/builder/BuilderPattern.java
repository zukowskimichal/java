package pl.dev.java.essentials.pattern.builder;

public class BuilderPattern {

    public void buildViaPattern() {
        Product product = new Product.Builder().id(1).build();
        Category category = Category.builder().id(1).build();
    }
}
