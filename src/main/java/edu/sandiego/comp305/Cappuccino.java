package edu.sandiego.comp305;

public class Cappuccino extends Drink {

    public Cappuccino(boolean isIced) {
        super("Cappuccino", 5.5, false);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getItem() + "...");
        System.out.println("Espresso + Steamed Milk + Foam");
    }

}
