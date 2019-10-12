package pl.dev.java.essentials.pattern.builder;

/*
builder pattern
 */
public class Product {
    private int id;
    private String node;
    private double price;
    private double weight;
    private String category;

    public Product() {
    }


    public Product(Builder builder) {
        this.id = builder.id;
        this.node = builder.node;
        this.price = builder.price;
        this.weight = builder.weight;
        this.category = builder.category;

    }

    public static class Builder {
        private int id;
        private String node;
        private double price;
        private double weight;
        private String category;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder node(String node) {
            this.node = node;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }


}
