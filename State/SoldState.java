package State;

// Конкретное состояние
public class SoldState implements State {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Пожалуйста, подождите, продукт уже выдается.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Вы не можете вернуть монету после нажатия кнопки.");
    }

    @Override
    public void pressButton() {
        System.out.println("Вы уже нажали кнопку.");
    }

    @Override
    public void dispense() {
        System.out.println("Продукт выдан.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }
}