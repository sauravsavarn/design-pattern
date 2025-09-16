package test.behavioural.strategy;

public class PayPal implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment via PayPal");
    }
}
