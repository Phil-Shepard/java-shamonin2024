package TemplateMethod;

// Шаблонный метод
abstract class Beverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Закипятить воду");
    }

    private void pourInCup() {
        System.out.println("Налить напиток");
    }

    protected abstract void brew();

    protected abstract void addCondiments();
}






