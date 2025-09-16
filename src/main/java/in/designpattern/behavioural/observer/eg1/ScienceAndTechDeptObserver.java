package in.designpattern.behavioural.observer.eg1;

public class ScienceAndTechDeptObserver implements Observer{
    @Override
    public void update(String year, String amount) {
        System.out.println("[ScienceAndTechDeptObserver] : Budget " + year + " of amount "  + amount + "passed in parliament...");
    }
}
