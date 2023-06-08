package Iterator;

public class OnlineShop {
    public static void main(String[] args) {
        // Create a product catalog
        ProductCatalog catalog = new ProductCatalog();

        // Add products to the catalog
        catalog.addProduct(new Product("Smartphone", 1000.0));
        catalog.addProduct(new Product("Laptop", 1500.0));
        catalog.addProduct(new Product("Headphones", 200.0));

        // Create an iterator for the product catalog
        Iterator<Product> iterator = catalog.createIterator();

        // Iterate over the products using the iterator
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
}
