package Flyweight;

public class Client {
    public static void main(String[] args) {
        // Create the ProductFactory
        ProductFactory productFactory = new ProductFactory();

        // Create the OnlineShop
        OnlineShop onlineShop = new OnlineShop(productFactory);

        // Display products using the OnlineShop
        onlineShop.displayProduct("Electronics", "Electronics description", "electronics_image.jpg");
        onlineShop.displayProduct("Clothing", "Clothing description", "clothing_image.jpg");
        onlineShop.displayProduct("Electronics", "Electronics description", "electronics_image.jpg");
    }
}
