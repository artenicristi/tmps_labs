package State;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.processOrder();
        order.shipOrder();
        order.deliverOrder();
    }
}
