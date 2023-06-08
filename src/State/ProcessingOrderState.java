package State;

public class ProcessingOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is already being processed.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Shipping order...");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver an order that hasn't been shipped.");
    }
}
