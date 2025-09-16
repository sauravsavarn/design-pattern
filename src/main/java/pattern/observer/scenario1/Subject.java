package pattern.observer.scenario1;

public interface Subject extends Observer{
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
