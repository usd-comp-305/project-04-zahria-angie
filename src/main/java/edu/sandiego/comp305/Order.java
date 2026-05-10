package edu.sandiego.comp305;
import java.util.Scanner;

public class Order {

    private final String customerName;
    //private final List<Drink> drinks;

    //private final List<Food> foods;

    public Order(final String customerName) {
        this.customerName = customerName;
        //this.drinks = new ArrayList<>();
        //this.foods = new ArrayList<>();
    }

    //public void addDrink(Drink drink) {
    //    drinks.add(drink);
    //}

    //public void addFood(final Food food) {
    //    foods.add(food);
    //}

    public double calculateTotal() {
        final double total = 0.0;

        //for (Drink drink : drinks) {
        //    total += drink.getPrice();
        //}

        //for (Food food : foods) {
        //    total += food.getPrice();
        //}

        return total;
    }

    public void prepareOrder() {
        //for (Drink drink : drinks) {
        //    drink.prepare();
        //}

        //for (Food food : foods) {
        //    food.prepare();
        //}
    }

    public void printReceipt() {
        System.out.println("\nReceipt for " + customerName);

        //for (Drink drink : drinks) {
        //    System.out.println(drink.getItem() + " - $" + drink.getPrice());
        //}

        //for (Food food : foods) {
        //    System.out.println(food.getItem() + " - $" + food.getPrice());
        //}

        System.out.println("Total: $" + calculateTotal());
    }

    public void completePayment(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How will you be paying?");
        System.out.print("Cash || Card");
        String userPaymentMethod = scanner.nextLine();

        ProcessPayment processor = new ProcessPayment();

        if (userPaymentMethod.equalsIgnoreCase("Cash")) {
            processor.setPaymentStrategy(new CashPayment());
            System.out.println("Your total is $" + calculateTotal() + ", please pay here: ");
            double paidAmount = scanner.nextDouble();
            processor.processPayment(calculateTotal(), paidAmount);

        } else if (userPaymentMethod.equalsIgnoreCase("Card")) {
            processor.setPaymentStrategy(new CardPayment());
            processor.processPayment(calculateTotal(), calculateTotal());

        } else{
            System.out.println("Invalid payment method.");
        }

        System.out.println("Thank you! Your order will be out shortly.");
        scanner.close();
    }
}
