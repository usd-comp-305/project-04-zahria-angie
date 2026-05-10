package edu.sandiego.comp305;

public interface PaymentStrategy {

    public abstract void processPayment(double amount, double paidAmount);

}
