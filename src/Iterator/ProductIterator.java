package Iterator;

import java.util.List;

class ProductIterator implements Iterator<Product> {
    private List<Product> products;
    private int currentIndex;

    public ProductIterator(List<Product> products) {
        this.products = products;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < products.size();
    }

    @Override
    public Product next() {
        Product product = products.get(currentIndex);
        currentIndex++;
        return product;
    }
}