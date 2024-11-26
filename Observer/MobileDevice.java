package Observer;

// Конкретный наблюдатель
class MobileDevice implements Observer {
    private final String name;

    public MobileDevice(String name) {
        this.name = name;
    }

    @Override
    public void update(String weather) {
        System.out.println(name + " получил обновление погоды: " + weather);
    }
}
