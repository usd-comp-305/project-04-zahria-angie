package edu.sandiego.comp305;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.nio.charset.StandardCharsets;

public class Order {

    private final String customerName;

    private final List<Drink> drinks;

    private final List<Food> foods;

    public Order(final String customerName,
                 final List<Drink> drinks, final List<Food> foods) {
        this.customerName = customerName;
        this.drinks = new ArrayList<>();
        this.foods = new ArrayList<>();
    }

    public void addDrink(final Drink drink) {
        drinks.add(drink);
    }

    public void addFood(final Food food) {
        foods.add(food);
    }

    public double calculateTotal() {
        double total = 0.0;

        for (Drink drink : drinks) {
            total += drink.getPrice();
        }

        for (Food food : foods) {
            total += food.getPrice();
        }

        return total;
    }

    public void prepareOrder() {
        for (Drink drink : drinks) {
            drink.prepare();
        }

        for (Food food : foods) {
            food.prepare();
        }
    }

    public void printReceipt() {
        System.out.println("\nReceipt for " + customerName +":");

        for (Drink drink : drinks) {
            System.out.println(drink.getItem() + " - $" + drink.getPrice());
        }

        for (Food food : foods) {
            System.out.println(food.getDescription() + " - $" +
                    food.getPrice());
        }

        System.out.printf("Total: $%.2f%n", calculateTotal());
    }

    public void completePayment(){
        final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("How will you be paying?");
        System.out.print("Cash || Card\n");
        final String userPaymentMethod = scanner.nextLine();

        final ProcessPayment processor = new ProcessPayment();

        if (userPaymentMethod.equalsIgnoreCase("Cash")) {
            processor.setPaymentStrategy(new CashPayment());
            System.out.println("Your total is $" + calculateTotal() + ": ");
            final double paidAmount = scanner.nextDouble();
            processor.processPayment(calculateTotal(), paidAmount);

        } else if (userPaymentMethod.equalsIgnoreCase("Card")) {
            processor.setPaymentStrategy(new CardPayment());
            processor.processPayment(calculateTotal(), calculateTotal());

        } else {
            System.out.println("Invalid payment method.");
            return;
        }

        System.out.println("\nThank you! Your order will be out shortly.");
        scanner.close();
    }
}
