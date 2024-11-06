package Proxy;

// Реальный класс
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Загрузка изображения: " + filename);
    }

    public void display() {
        System.out.println("Отображение изображения: " + filename);
    }
}
