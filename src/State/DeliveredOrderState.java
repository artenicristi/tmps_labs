package State;

public class DeliveredOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Cannot process a delivered order.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship a delivered order.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is already delivered.");
    }
}