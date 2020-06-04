public class Calculator {
    double firstNumber;
    double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    double multiplication() {
        double result = firstNumber * secondNumber;
        return result;
    }

    double division () {
        double result = firstNumber / secondNumber;
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5);
        System.out.println(calculator.division());
    }
}
