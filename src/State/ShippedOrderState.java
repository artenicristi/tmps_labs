package State;

public class ShippedOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Cannot process a shipped order.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Delivering order...");
        order.setState(new DeliveredOrderState());
    }
}
