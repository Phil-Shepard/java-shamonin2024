package AbstractFactory;

// Конкретный продукт
public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Электрический двигатель запущен.");
    }
}
