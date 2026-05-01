package edu.sandiego.comp305;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeSimulator {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Order> orders = new ArrayList<>();

    public void start() {
        System.out.println("======================");
        System.out.println(" WELCOME TO OOP CAFE ");
        System.out.println("======================");

        System.out.println("Customer Name:");
        String name = scanner.nextLine();
        // add in case when name is blank

        Order order = new Order(name);
        takeOrder(order);

        System.out.println("\n---Preparing Order---");
        order.prepareOrder();
        order.printReceipt();

        //payment processor

        System.out.println("\nOrder Complete!\n");
    }

    private void takeOrder(Order order) {
        boolean adding = true;
        while (adding) {
            System.out.println("MENU: [1] Drink  [2] Food  [3] Checkout");
            System.out.println("Selection: ");
            String category = scanner.nextLine();

            if (category.equals("3")) {
                adding = false;
            } else if (category.equals("1")) {
                handleDrinkSelection(order);
            } else if (category.equals("2")) {
                handleFoodSelection(order);
            } else {
                System.out.println("INVALID");
            }
        }
    }

    private void handleDrinkSelection(Order order) {
        System.out.println("\n---Drinks---");
        System.out.println("[1] Americano");
        System.out.println("[2] Latte");
        System.out.println("[3] Cappuccino");
        System.out.println("[4] Black Coffee");
        System.out.println("Selection: ");
        String choice = scanner.nextLine();

        System.out.println("Iced? (y/n": );
        boolean iced = scanner.nextLine().equalsIgnoreCase("y");

        switch (choice) {
            case "1":
                order.addDrink(new Americano(iced));
            case "2":
                order.addDrink(new Latte(iced));
            case "3":
                order.addDrink(new Cappuccino(iced));
            case "4":
                order.addDrink(new BlackCoffee(iced));
            default:
                System.out.println("Drink unavailable");
        }
    }

    private void handleFoodSelection(Order order) {
        //same thing as handleDrinkSelection but tbd
        //due to Decorator pattern...
    }
}
