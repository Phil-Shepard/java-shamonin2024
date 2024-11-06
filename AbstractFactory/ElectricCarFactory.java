package AbstractFactory;

// Конкретная фабрика
public class ElectricCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}
