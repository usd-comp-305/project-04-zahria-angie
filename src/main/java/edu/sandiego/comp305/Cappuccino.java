package edu.sandiego.comp305;

public class Cappuccino extends Drink {

    public Cappuccino(String item, double price, String size, boolean isIced) {
        super("Cappuccino", 5.5, size, false);
    }

    @Override
    public void prepare() {

    }

}
