package test.behavioural.strategy;

public class UPI implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment via UPI");
    }
}
