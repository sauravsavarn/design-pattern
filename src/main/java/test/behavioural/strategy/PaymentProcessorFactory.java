package test.behavioural.strategy;

public class PaymentProcessorFactory {

    public static PaymentStrategy paymentMode(String mode) {
        return (PaymentStrategy) switch (mode) {
            case "CreditCard" -> new CreditCard();
            case "PayPal" -> new PayPal();
            case "UPI" -> new PayPal();
            default -> new IllegalArgumentException("No such payment mode has been setup yet");
        };
    }
}
