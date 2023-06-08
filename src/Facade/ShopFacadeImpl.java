package Facade;

public class ShopFacadeImpl implements ShopFacade {
    private InventorySystem inventorySystem;
    private PaymentSystem paymentSystem;
    private ShippingSystem shippingSystem;

    public ShopFacadeImpl() {
        this.inventorySystem = new InventorySystem();
        this.paymentSystem = new PaymentSystem();
        this.shippingSystem = new ShippingSystem();
    }

    public void placeOrder(Order order) {
        // Check product availability
        inventorySystem.checkAvailability(order.getProduct());

        // Process payment
        paymentSystem.processPayment(order);

        // Ship the order
        shippingSystem.shipOrder(order);
    }
}

