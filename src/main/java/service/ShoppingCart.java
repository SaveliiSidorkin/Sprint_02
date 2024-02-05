package service;

import model.Food;


public class ShoppingCart {
    private Food[] food = new Food[]{};

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalPrice() {
        int totalPrice = 0;
        for (Food item : food) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceDiscounted() {
        int totalPriceDiscounted = 0;
        for (Food item : food) {
            totalPriceDiscounted += item.getTotalPriceDiscounted();
        }
        return totalPriceDiscounted;
    }

    public double getTotalPriceVegetarian() {
        int totalPrice = 0;
        for (Food item : food) {
            if (item.isVegetarian()) {
                totalPrice += item.getTotalPrice();
            }
        }
        return totalPrice;
    }
}
