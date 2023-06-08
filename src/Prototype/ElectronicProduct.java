package Prototype;

public class ElectronicProduct implements Product {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product clone() {
        ElectronicProduct clonedProduct = new ElectronicProduct();
        clonedProduct.setName(this.name);
        clonedProduct.setPrice(this.price);
        return clonedProduct;
    }
}
