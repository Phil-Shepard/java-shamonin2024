package State;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();
        vendingMachine.pressButton();
        vendingMachine.insertCoin();
        vendingMachine.ejectCoin();
    }
}

