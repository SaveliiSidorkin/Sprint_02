package model;

public class Meat extends Food {
    private int amount;
    private double price;

    public Meat(int amount, double price) {
        super(amount, price, false);
    }


    @Override
    public boolean isVegetarian() {
        return false;
    }
}

