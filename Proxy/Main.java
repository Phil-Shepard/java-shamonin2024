package Proxy;

// Использование
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        image1.display();
        image1.display();
    }
}