package edu.sandiego.comp305;

public class ProcessPayment {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(final PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(final double amount, final double paidAmount){
        paymentStrategy.processPayment(amount,paidAmount);
    }

}
