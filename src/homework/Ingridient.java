package homework;

public class Ingridient {
    String ingridient;
    int amount;

    public Ingridient(String ingridient, int amount) {
        this.ingridient = ingridient;
        this.amount = amount;
    }

    public String getIngridient() {
        return ingridient;
    }

    public void setIngridient(String ingridient) {
        this.ingridient = ingridient;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ingridient{" +
                "ingridient='" + ingridient + '\'' +
                ", amount=" + amount +
                '}';
    }
}
