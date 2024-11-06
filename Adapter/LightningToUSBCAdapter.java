package Adapter;

//Pattern Adapter
// Адаптер
public class LightningToUSBCAdapter implements USBTypeC {
    private LightningDevice lightningDevice;


    public LightningToUSBCAdapter(LightningDevice device) {
        this.lightningDevice = device;
    }

    @Override
    public void chargeWithUSBC() {
        lightningDevice.chargeWithLightning();  // Используем старый метод для зарядки
    }
}
