package Flyweight;

public class ConcreteProduct implements Product {
    private String name;
    private String description;
    private String image;

    public ConcreteProduct(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    @Override
    public void display() {
        System.out.println("Product: " + name);
        System.out.println("Description: " + description);
        System.out.println("Image: " + image);
        System.out.println();
    }
}

