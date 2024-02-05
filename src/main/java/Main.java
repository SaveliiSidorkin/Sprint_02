import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {


    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.00);
        Apple redApple = new Apple(10, 50.00, "red");
        Apple greenApple = new Apple(8, 60.00, "green");
        Food[] food = new Food[3];
        food[0] = meat;
        food[1] = redApple;
        food[2] = greenApple;
        ShoppingCart shoppingCart = new ShoppingCart(food);
        String getTotalPrice = String.format("Общая сумма товаров без скидки: %.2f", shoppingCart.getTotalPrice());
        String getTotalPriceDiscounted = String.format("Общая сумма товаров со скидкой: %.2f", shoppingCart.getTotalPriceDiscounted());
        String getTotalPriceVegetarian = String.format("Сумма вегетерианских продуктов без скидки: %.2f", shoppingCart.getTotalPriceVegetarian());
        System.out.println(getTotalPrice);
        System.out.println(getTotalPriceDiscounted);
        System.out.println(getTotalPriceVegetarian);

    }
}
