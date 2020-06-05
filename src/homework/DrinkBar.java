package homework;

public class DrinkBar {
    public static void main(String[] args) {
       // Drink cosmopolitan = new Drink("Cosmopolitan", 24,true, "orangeVodka", "orangeLiqueur", "cranberryJuice", "limeJuice", "limePeel", 60, 15,40, 10);

        Ingridient [] ingridients = new Ingridient[1];
        ingridients[0] = new Ingridient("woda", 100);

        Drink drink = new Drink("woda",20, true,ingridients);




        System.out.println(drink.toString());

    }
}
