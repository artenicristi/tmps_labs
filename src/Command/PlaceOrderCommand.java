package Command;

class PlaceOrderCommand implements Command {
    private final Receiver receiver;

    public PlaceOrderCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.placeOrder();
    }
}
