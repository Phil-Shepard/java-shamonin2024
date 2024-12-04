package State;

// Конкретное состояние
public class NoCoinState implements State {
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Монета вставлена.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("Монета не вставлена.");
    }

    @Override
    public void pressButton() {
        System.out.println("Сначала вставьте монету.");
    }

    @Override
    public void dispense() {
        System.out.println("Нельзя выдать продукт. Монета отсутствует.");
    }
}
