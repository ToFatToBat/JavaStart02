package homework;

public class Drink {
    String name;
    double price;
    boolean isAlcohol;
    String ingridient1;
    String ingridient2;
    String ingridient3;
    String ingridient4;
    String ingridient5;
    int mlOfingridient1;
    int mlOfingridient2;
    int mlOfingridient3;
    int mlOfingridient4;
    int dddd;

    public Drink(String name, double price, boolean isAlcohol, String ingridient1, String ingridient2, String ingridient3, String ingridient4, String ingridient5, int mlOfingridient1, int mlOfingridient2, int mlOfingridient3, int mlOfingridient4) {
        this.name = name;
        this.price = price;
        this.isAlcohol = isAlcohol;
        this.ingridient1 = ingridient1;
        this.ingridient2 = ingridient2;
        this.ingridient3 = ingridient3;
        this.ingridient4 = ingridient4;
        this.ingridient5 = ingridient5;
        this.mlOfingridient1 = mlOfingridient1;
        this.mlOfingridient2 = mlOfingridient2;
        this.mlOfingridient3 = mlOfingridient3;
        this.mlOfingridient4 = mlOfingridient4;
    }

    @Override
    public String toString() {
        String info =
                "Nazwa " + name + "\n" +
                " Cena " + price + "\n" +
                " Czy posiada alkohol " + isAlcohol + "\n" +
                " Składnik 1 " + ingridient1 + "\n" +
                " Składnik 2 " + ingridient2 + "\n" +
                " Składnik 3 " + ingridient3 + "\n" +
                " Składnik 4 " + ingridient4 + "\n" +
                " Składnik 5 " + ingridient5 + "\n" +
                " Ml skladnika 1 " + mlOfingridient1 + "\n" +
                " Ml skladnika 2 " + mlOfingridient2 + "\n" +
                " Ml skladnika 3 " + mlOfingridient3 + "\n" +
                " Ml skladnika 4 " + mlOfingridient4;
        return info;
    }
}
