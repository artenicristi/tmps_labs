package Prototype;

public class ClothingProduct implements Product {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product clone() {
        ClothingProduct clonedProduct = new ClothingProduct();
        clonedProduct.setName(this.name);
        clonedProduct.setPrice(this.price);
        return clonedProduct;
    }
}
