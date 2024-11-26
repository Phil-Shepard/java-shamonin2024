package Memento;

public class MementoPatternExample {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Состояние #1");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("Состояние #2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("Состояние #3");

        System.out.println("Текущее состояние: " + originator.getState());
        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("Возвращен к состоянию: " + originator.getState());
        originator.getStateFromMemento(caretaker.getMemento(1));
        System.out.println("Возвращен к состоянию: " + originator.getState());
    }
}