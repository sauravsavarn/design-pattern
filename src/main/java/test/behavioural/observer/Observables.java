package test.behavioural.observer;

import java.util.List;

public class Observables {
    List<Notification> observers;

    public Observables(List<Notification> observers) {
        this.observers = observers;
    }

    public void statusUpdate() {
        observers.stream().forEach(obs -> obs.notifies());
    }
}
