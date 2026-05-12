package edu.sandiego.comp305;

import java.util.Scanner;

import java.nio.charset.StandardCharsets;

public class CashPayment implements PaymentStrategy{
    @Override
    public void processPayment(final double amount, final double paidAmount) {
        final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        double totalPaid = paidAmount;

        while (totalPaid < amount){
            final double remaining = amount -totalPaid;
            System.out.printf("Insufficient payment, " +
                    "remainder: $%.2f%n", remaining);
            totalPaid = scanner.nextDouble();
        }

        final double change = totalPaid - amount;
        if (change > 0){
            System.out.printf("Payment accepted! Change: $%.2f%n", change);
        } else{
            System.out.println("Payment accepted!");
        }
    }
}
