package edu.sandiego.comp305;

public class Cappuccino extends Drink {

    public Cappuccino(final String item, final double price,
                      final String size, final boolean isIced) {
        super("Cappuccino", 5.5, size, false);
    }

    @Override
    public void prepare() {

    }

}
