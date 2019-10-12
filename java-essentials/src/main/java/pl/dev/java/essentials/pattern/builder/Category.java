package pl.dev.java.essentials.pattern.builder;

/*
 * builder pattern
 */
public class Category {
    private int id;
    private String node;
    private double name;
    private double factor;

    public Category() {
    }

    public static CategoryBuilder builder() {
        return new CategoryBuilder();
    }

    public void setId(int id) {
        this.id = id;
    }


    public Category(CategoryBuilder builder) {
        this.id = builder.id;
        this.node = builder.node;

    }

    public static class CategoryBuilder {
        private int id;
        private String node;
        private double price;
        private double weight;
        private String category;

        public CategoryBuilder id(int id) {
            this.id = id;
            return this;
        }

        public CategoryBuilder node(String node) {
            this.node = node;
            return this;
        }

        public CategoryBuilder price(double price) {
            this.price = price;
            return this;
        }

        public CategoryBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public CategoryBuilder category(String category) {
            this.category = category;
            return this;
        }

        public Category build() {
            return new Category(this);
        }

    }


}
