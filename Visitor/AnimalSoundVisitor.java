package Visitor;

public class AnimalSoundVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Dog barks");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Cat meows");
    }
}
