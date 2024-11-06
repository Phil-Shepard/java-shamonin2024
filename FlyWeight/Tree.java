package FlyWeight;

// Конкретный легковесный класс
public class Tree implements TreeType {
    private String color;
    private String type;

    public Tree(String color, String type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " " + type + " tree at (" + x + ", " + y + ")");
    }
}
