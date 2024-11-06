package Bridge;

// Конкретная реализация
class Radio implements Device {
    private boolean on;
    private int volume;

    @Override
    public void powerOn() {
        on = true;
        System.out.println("Radio is now ON.");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("Radio is now OFF.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + volume);
    }
}
