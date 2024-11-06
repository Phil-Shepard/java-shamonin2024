package Decorator;

// Конкретный декоратор
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.20;
    }
}
