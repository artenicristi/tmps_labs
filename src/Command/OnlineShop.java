package Command;

public class OnlineShop {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();

        Command addToCartCommand = new AddToCartCommand(receiver);
        Command placeOrderCommand = new PlaceOrderCommand(receiver);

        invoker.addCommand(addToCartCommand);
        invoker.addCommand(placeOrderCommand);

        invoker.executeCommands();
    }
}