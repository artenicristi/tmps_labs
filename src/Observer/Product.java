package Observer;

import java.util.ArrayList;
import java.util.List;

class Product implements Subject {
    private String name;
    private double price;
    private List<Observer> observers;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
