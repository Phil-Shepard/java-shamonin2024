package Bridge;

// Конкретная реализация
class TV implements Device {
    private boolean on;
    private int volume;

    @Override
    public void powerOn() {
        on = true;
        System.out.println("TV is now ON.");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("TV is now OFF.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }
}
