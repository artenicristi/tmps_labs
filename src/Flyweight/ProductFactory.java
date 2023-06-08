package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private Map<String, Product> products;

    public ProductFactory() {
        products = new HashMap<>();
    }

    public Product getProduct(String name, String description, String image) {
        // Check if the product already exists in the factory
        if (products.containsKey(name)) {
            return products.get(name);
        } else {
            // Create a new product and add it to the factory
            Product product = new ConcreteProduct(name, description, image);
            products.put(name, product);
            return product;
        }
    }
}

