package edu.sandiego.comp305;

public class Americano extends Drink {

    public Americano(final boolean isIced) {
        super("Americano", 4.5, isIced);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getItem() + "...");
        System.out.println("Espresso + Water");
    }
}
