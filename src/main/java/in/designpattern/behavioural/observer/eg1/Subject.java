package in.designpattern.behavioural.observer.eg1;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String year, String amount);
}