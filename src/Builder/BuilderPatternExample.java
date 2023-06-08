package Builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Product.Builder builder1 = new Product.Builder()
                .name("Product 1")
                .description("Description of Product 1")
                .price(9.99)
                .quantity(100);

        Product product1 = builder1.build();
        System.out.println("Product 1: " + product1.getName() + ", " +
                product1.getDescription() + ", " +
                product1.getPrice() + ", " +
                product1.getQuantity());


        Product.Builder builder2 = new Product.Builder()
                .name("Product 2")
                .description("Description of Product 2");

        Product product2 = builder2.build();
        System.out.println("Product 2: " + product2.getName() + ", " +
                product2.getDescription() + ", " +
                product2.getPrice() + ", " +
                product2.getQuantity());
    }
}
