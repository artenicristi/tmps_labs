package Flyweight;

public class OnlineShop {
    private ProductFactory productFactory;

    public OnlineShop(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    public void displayProduct(String name, String description, String image) {
        Product product = productFactory.getProduct(name, description, image);
        product.display();
    }

    // Other methods and logic in the online shop...
}

