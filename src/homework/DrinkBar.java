package homework;

public class DrinkBar {
    public static void main(String[] args) {

        Ingridient[] ingridients = new Ingridient[2];
        ingridients[0] = new Ingridient("woda", 50);
        ingridients[1] = new Ingridient("sok", 100);


        int ingridientsAmountSum = 0;
        for (int i = 0; i < ingridients.length; i++) {
            ingridientsAmountSum = ingridientsAmountSum + ingridients[i].amount;
        }


        Drink drink = new Drink("woda", 20, true, ingridients, ingridientsAmountSum);


        System.out.println(drink.toString());

    }
}
