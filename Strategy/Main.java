package Strategy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new Addition());
        System.out.println("5 + 3 = " + calculator.calculate(5, 3));

        calculator.setStrategy(new Subtraction());
        System.out.println("5 - 3 = " + calculator.calculate(5, 3));

        calculator.setStrategy(new Multiplication());
        System.out.println("5 * 3 = " + calculator.calculate(5, 3));

        calculator.setStrategy(new Division());
        System.out.println("5 / 3 = " + calculator.calculate(5, 3));
    }
}
