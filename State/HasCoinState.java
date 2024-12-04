package State;

// Конкретное состояние
public class HasCoinState implements State {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Монета уже вставлена.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Монета возвращена.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("Кнопка нажата.");
        vendingMachine.setState(vendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Нельзя выдать продукт до нажатия кнопки.");
    }
}
