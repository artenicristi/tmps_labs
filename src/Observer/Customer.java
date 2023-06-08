package Observer;

class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println("Hey " + name + "! The price of " + product.getName() + " has changed to " + product.getPrice());
    }
}