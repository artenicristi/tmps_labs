package Iterator;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog implements ProductCollection {
    private List<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Iterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}
