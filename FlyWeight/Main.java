package FlyWeight;

public class Main {
    public static void main(String[] args) {
        TreeFactory factory = new TreeFactory();

        TreeType oakTree = factory.getTree("Зелёный", "Дуб");
        oakTree.draw(10, 20);

        TreeType pineTree = factory.getTree("Зелёный", "Сосна");
        pineTree.draw(15, 30);

        TreeType anotherOakTree = factory.getTree("Зелёный", "Дуб");
        anotherOakTree.draw(20, 40);
    }
}
