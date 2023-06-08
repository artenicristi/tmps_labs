package Observer;

public class OnlineShop {
    public static void main(String[] args) {
        // Create a product
        Product product = new Product("Smartphone", 1000.0);

        // Create customers
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Alice");

        // Attach customers as observers to the product
        product.attach(customer1);
        product.attach(customer2);

        // Change the price of the product
        product.setPrice(900.0);

        // Detach customer2 as an observer
        product.detach(customer2);

        // Change the price of the product again
        product.setPrice(800.0);
    }
}
