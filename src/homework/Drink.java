package homework;

import java.util.Arrays;
import java.util.List;


public class Drink {
    String name;
    double price;
    boolean isAlcohol;
    int drinkAmount;

    Ingridient [] ingridients;

    public Drink(String name, double price, boolean isAlcohol, Ingridient [] ingridients, int drinkAmount) {
        this.name = name;
        this.price = price;
        this.isAlcohol = isAlcohol;
        this.ingridients = ingridients;
        this.drinkAmount = drinkAmount;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isAlcohol=" + isAlcohol +
                ", drinkAmount=" + drinkAmount +
                ", ingridients=" + Arrays.toString(ingridients) +
                '}';
    }
}
