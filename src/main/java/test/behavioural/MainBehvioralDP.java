package test.behavioural;

import test.behavioural.strategy.PaymentProcessorFactory;
import test.behavioural.strategy.PaymentStrategy;

public class MainBehvioralDP {

    public static void main(String[] args) {
        //StrategyDP
        PaymentStrategy paymentModePayPal = PaymentProcessorFactory.paymentMode("PayPal");
        paymentModePayPal.pay();

        PaymentStrategy paymentModeOthers = PaymentProcessorFactory.paymentMode("XYZ");
        paymentModeOthers.pay();
    }
}
