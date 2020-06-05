package homework;

import java.util.Arrays;
import java.util.List;


public class Drink {
    String name;
    double price;
    boolean isAlcohol;

    Ingridient [] ingridients;

    public Drink(String name, double price, boolean isAlcohol, Ingridient [] ingridients) {
//    public Drink(String name, double price, boolean isAlcohol, List<Ingridient> ingridients) {
        this.name = name;
        this.price = price;
        this.isAlcohol = isAlcohol;
        this.ingridients = ingridients;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isAlcohol=" + isAlcohol +
                ", ingridients=" + Arrays.toString(ingridients) +
                '}';
    }
}
