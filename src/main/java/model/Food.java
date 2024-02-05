package model;
//тест 2 тест 3 тест 4
public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    public double getTotalPrice() {
        return amount * price;
    } //метод расчета полной стоимости

    public double getTotalPriceDiscounted() {
        return getTotalPrice() - getTotalPrice() * getDiscount();
    } //метод расчета стоимости со скидкой

    public abstract boolean isVegetarian();//метод, возвращающий веганский флаг


}
