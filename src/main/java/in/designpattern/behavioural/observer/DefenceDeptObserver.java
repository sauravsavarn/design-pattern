package in.designpattern.behavioural.observer;

public class DefenceDeptObserver implements Observer{
    @Override
    public void update(String year, String amount) {
        System.out.println("[DefenceDeptObserver] : Budget " + year + " of amount "  + amount + "passed in parliament...");
    }
}
