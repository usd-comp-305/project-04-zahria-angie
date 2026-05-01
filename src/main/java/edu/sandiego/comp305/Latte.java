package edu.sandiego.comp305;

public class Latte extends Drink {

    public Latte(boolean isIced) {
        super("Latte", 5, isIced);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getItem() + "...");
        System.out.println("Espresso + Steamed Milk");
    }
}
