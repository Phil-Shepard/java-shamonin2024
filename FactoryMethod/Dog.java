package FactoryMethod;

// Конкретный продукт
class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
