package Prototype;

public interface Product extends Cloneable {
    void setName(String name);
    void setPrice(double price);
    Product clone();
}
