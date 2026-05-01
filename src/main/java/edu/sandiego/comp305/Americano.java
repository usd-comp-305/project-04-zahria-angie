package edu.sandiego.comp305;

public class Americano extends Drink {

    public Americano(final String item, final double price,
                     final String size, final boolean isIced) {
        super("Americano", 4.5, size, isIced);
    }

    @Override
    public void prepare() {

    }
}
