package Memento;

// паттерн Memento
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // Восстанавливает состояние из Memento
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

    public static class Memento {
        private final String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }
}





