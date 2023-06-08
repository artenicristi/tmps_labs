package State;

public class NewOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing new order...");
        order.setState(new ProcessingOrderState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship a new order.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver a new order.");
    }
}
