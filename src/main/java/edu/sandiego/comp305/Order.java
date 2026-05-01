package edu.sandiego.comp305;

import java.sql.Array;
import java.util.ArrayList;

public class Order {

    private final String customerName;
    private final List<Drink> drinks;
    private final List<Food> foods;

    public Order(String customerName) {
        this.customerName = customerName;
        this.drinks = new ArrayList<>();
        this.foods = new ArrayList<>();
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addFood(Food food) {
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
        System.out.println("\nReceipt for " + customerName);

        for (Drink drink : drinks) {
            System.out.println(drink.getName() + " - $" + drink.getPrice());
        }

        for (Food food : foods) {
            System.out.println(food.getName() + " - $" + food.getPrice());
        }

        System.out.println("Total: $" + calculateTotal());
    }
}
