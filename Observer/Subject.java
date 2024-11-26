package Observer;

// Объект
interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}









