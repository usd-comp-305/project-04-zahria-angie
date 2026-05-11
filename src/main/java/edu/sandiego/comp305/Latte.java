package edu.sandiego.comp305;

public class Latte extends Drink {

    public Latte(final boolean isIced) {
        super("Latte", 5, isIced);
    }

    @Override
    protected void extraPrep() {
        System.out.println("Espresso + Steamed Milk");
    }
}
