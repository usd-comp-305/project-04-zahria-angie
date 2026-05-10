package edu.sandiego.comp305;

public class CardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount, double paidAmount) {
        System.out.printf("Card charged: $%.2f. Payment successful!%n", amount);


    }
}
