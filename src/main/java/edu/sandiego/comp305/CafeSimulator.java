package edu.sandiego.comp305;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeSimulator {
    private final Scanner scanner = new Scanner(System.in,
            java.nio.charset.StandardCharsets.UTF_8);

    public static void main(String[] args) {
        CafeSimulator simulator = new CafeSimulator();
        simulator.start();
    }

    public void start() {
        printBorder("WELCOME TO OOP CAFE");

        System.out.println("Customer Name:");
        final String name = scanner.nextLine();

        final Order order = new Order(name,
                new ArrayList<>(), new ArrayList<>());
        printSection("TAKING ORDER");
        takeOrder(order);

        printSection("PREPARING ORDER");
        order.prepareOrder();

        printSection("PRINTING RECEIPT");
        order.printReceipt();

        printSection("PAYMENT");
        order.completePayment();

        printBorder("ORDER COMPLETE - THANK YOU!");
    }

    private void takeOrder(final Order order) {
        boolean adding = true;
        while (adding) {
            printSubSection("MENU");
            System.out.println("[1] Drink");
            System.out.println("[2] Food");
            System.out.println("[3] Checkout");
            System.out.println("Selection: ");
            final String category = scanner.nextLine();

            switch (category){
                case "1":
                    handleDrinkSelection(order);
                    break;
                case "2":
                    handleFoodSelection(order);
                    break;
                case "3":
                    adding = false;
                    break;
                default:
                    System.out.println("INVALID SELECTION");
            }
        }
    }

    private void handleDrinkSelection(final Order order) {
        printSubSection("DRINK MENU");
        System.out.println("[1] Americano");
        System.out.println("[2] Latte");
        System.out.println("[3] Cappuccino");
        System.out.println("[4] Black Coffee");
        System.out.println("Selection: ");
        final String choice = scanner.nextLine();

        System.out.println("Iced? (y/n):" );
        final boolean iced = scanner.nextLine().equalsIgnoreCase("y");
        //System.out.println(iced ? "Iced selected" : "Hot selected");

        switch (choice) {
            case "1":
                order.addDrink(new Americano(iced));
                break;
            case "2":
                order.addDrink(new Latte(iced));
                break;
            case "3":
                order.addDrink(new Cappuccino(iced));
                break;
            case "4":
                order.addDrink(new BlackCoffee(iced));
                break;
            default:
                System.out.println("DRINK UNAVAILABLE");
        }
    }

    private void handleFoodSelection(final Order order) {
        printSubSection("FOOD MENU");
        System.out.println("[1] Bagel");
        System.out.println("[2] Croissant");
        System.out.println("[3] Muffin");
        System.out.println("Selection: ");
        final String choice = scanner.nextLine();

        Food food = null;

        switch (choice) {
            case "1":
                food = new ConcreteBagel();

                System.out.println("Choose a flavor:");
                System.out.println("[1] Blueberry");
                System.out.println("[2] Everything");
                System.out.println("Selection: ");

                final String bagelFlavor = scanner.nextLine();

                switch (bagelFlavor) {
                    case "1":
                        food = new BlueberryBagel((Bagel) food);
                        break;
                    case "2":
                        food = new EverythingBagel((Bagel) food);
                        break;
                    default:
                        System.out.println("INVALID FLAVOR");
                }
                break;

            case "2":
                food = new ConcreteCroissant();

                System.out.println("Choose a flavor:");
                System.out.println("[1] Chocolate");
                System.out.println("[2] Almond");
                System.out.print("Selection: ");

                final String croissantFlavor = scanner.nextLine();

                switch (croissantFlavor) {
                    case "1":
                        food = new ChocolateCroissant((Croissant) food);
                        break;
                    case "2":
                        food = new AlmondCroissant((Croissant) food);
                        break;
                    default:
                        System.out.println("INVALID FLAVOR");
                }
                break;

            case "3":
                food = new ConcreteMuffin();

                System.out.println("Choose a flavor:");
                System.out.println("[1] Banana Nut");
                System.out.println("[2] Poppyseed");
                System.out.print("Selection: ");

                final String muffinFlavor = scanner.nextLine();

                switch (muffinFlavor) {
                    case "1":
                        food = new BananaNutMuffin((Muffin) food);
                        break;
                    case "2":
                        food = new PoppyseedMuffin((Muffin) food);
                        break;
                    default:
                        System.out.println("INVALID FLAVOR");
                }
                break;

            default:
                System.out.println("FOOD UNAVAILABLE");
                return;
        }

        order.addFood(food);
    }

    private void printBorder(final String title) {
        System.out.println("======================");
        System.out.println("  " + title);
        System.out.println("======================");
    }

    private void printSection(final String title) {
        System.out.println("\n----------------------");
        System.out.println("  " + title);
        System.out.println("----------------------");
    }

    private void printSubSection(final String title) {
        System.out.println("\n--- " + title + " ---");
    }
}
