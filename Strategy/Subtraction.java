package Strategy;

// Конкретная стратегия
public class Subtraction implements Operation {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
