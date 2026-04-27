package edu.sandiego.comp305;

public class Latte extends Drink {

    public Latte(final String item, final double price, final String size, final boolean isIced) {
        super("Latte", 5, size, isIced);
    }

    @Override
    public void prepare() {

    }
}
