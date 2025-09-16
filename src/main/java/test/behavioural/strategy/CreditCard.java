package test.behavioural.strategy;

public class CreditCard implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment via CreditCard");
    }
}
