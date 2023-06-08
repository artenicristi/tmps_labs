package Facade;

public class Client {
    public static void main(String[] args) {
        ShopFacade shopFacade = new ShopFacadeImpl();

        // Create an order
        Order order = new Order(new Product("ABC123"), new Customer("Tester test", "test@gmail.com"));

        // Place the order using the facade
        shopFacade.placeOrder(order);
    }
}

