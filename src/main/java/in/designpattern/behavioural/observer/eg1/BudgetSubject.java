package in.designpattern.behavioural.observer.eg1;

import java.util.ArrayList;
import java.util.List;

public class BudgetSubject implements Subject{
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String year, String amount) {
        //observerList.stream().iterator().next().update(year, amount);
        observerList.stream().forEach(eachObserver -> eachObserver.update(year, amount));
    }

    public void state(String year, String amount) {
        notifyObserver(year, amount);
    }
}
