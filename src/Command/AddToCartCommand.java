package Command;

class AddToCartCommand implements Command {
    private final Receiver receiver;

    public AddToCartCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.addToCart();
    }
}
