package Decorator;

// Конкретный компонент
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
