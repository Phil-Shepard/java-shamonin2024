package Memento;

import java.util.ArrayList;
import java.util.List;

// Хранение Memento
class Caretaker {
    private final List<Originator.Memento> mementoList = new ArrayList<>();

    public void addMemento(Originator.Memento memento) {
        mementoList.add(memento);
    }

    public Originator.Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
