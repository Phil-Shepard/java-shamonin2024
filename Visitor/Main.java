package Visitor;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        AnimalVisitor soundVisitor = new AnimalSoundVisitor();

        dog.accept(soundVisitor);
        cat.accept(soundVisitor);
    }
}
