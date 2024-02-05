package model;

import model.constants.Colour;

import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }


    @Override
    public double getDiscount() {
        return Colour.RED.equals(colour) ? DISCOUNT : 0;
    }


    @Override
    public boolean isVegetarian() {
        return true;
    }
}

