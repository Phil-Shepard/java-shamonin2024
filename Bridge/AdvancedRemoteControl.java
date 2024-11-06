package Bridge;

// Уточненная Абстракция
class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.powerOn();
    }

    @Override
    public void turnOff() {
        device.powerOff();
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    // Дополнительная функциональность
    public void mute() {
        System.out.println("Muting the device.");
        device.setVolume(0);
    }
}
