package edu.sandiego.comp305;

public class Latte extends Drink {

    public Latte(String item, double price, String size, boolean isIced) {
        super("Latte", 5, size, isIced);
    }

    @Override
    public void prepare() {

    }
}
