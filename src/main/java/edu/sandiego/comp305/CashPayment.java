package edu.sandiego.comp305;

import java.util.Scanner;

public class CashPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount, double paidAmount) {
        Scanner scanner = new Scanner(System.in);
        double totalPaid = paidAmount;

        while (totalPaid < amount){
            double remaining = amount -totalPaid;
            System.out.printf("Insufficient payment. Please pay the remainder: " + remaining);
            totalPaid = scanner.nextDouble();
        }

        double change = totalPaid - amount;
        if (change > 0){
            System.out.printf("Payment accepted! Your change is: $%.2f%n", change);
        } else{
            System.out.println("Payment accepted!");
        }
    }
}
