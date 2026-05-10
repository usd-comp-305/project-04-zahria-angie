package edu.sandiego.comp305;

public class ProcessPayment {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount, double paidAmount){
        paymentStrategy.processPayment(amount,paidAmount);
    }

}
