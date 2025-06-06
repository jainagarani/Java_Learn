package designpappern.behavioural.observerPattern;

public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
