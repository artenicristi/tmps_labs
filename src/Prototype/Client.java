package Prototype;

public class Client {
    public static void main(String[] args) {
        ProductRegistry registry = new ProductRegistry();
        Product electronicPrototype = registry.getProduct("electronic");
        Product clothingPrototype = registry.getProduct("clothing");

        Product newElectronicProduct = electronicPrototype.clone();
        Product newClothingProduct = clothingPrototype.clone();
    }
}
