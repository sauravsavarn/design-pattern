package in.designpattern.behavioural.observer.eg1;

public class MainObserver {
    public static void main(String[] args) {
        ScienceAndTechDeptObserver scienceAndTechDeptObserver = new ScienceAndTechDeptObserver();
        DefenceDeptObserver defenceDeptObserver = new DefenceDeptObserver();

        BudgetSubject budgetSubject = new BudgetSubject();
        budgetSubject.addObserver(scienceAndTechDeptObserver);
        budgetSubject.addObserver(defenceDeptObserver);

        budgetSubject.state("2025", "400 Billion USD");
    }
}
