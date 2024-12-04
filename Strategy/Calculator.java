package Strategy;

// Контекст
public class Calculator {
    private Operation strategy;

    public void setStrategy(Operation strategy) {
        this.strategy = strategy;
    }

    public double calculate(double a, double b) {
        if (strategy == null) {
            throw new IllegalStateException("Стратегия не установлена.");
        }
        return strategy.execute(a, b);
    }
}

