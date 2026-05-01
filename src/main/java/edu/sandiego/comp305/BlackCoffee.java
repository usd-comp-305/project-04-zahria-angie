package edu.sandiego.comp305;

public class BlackCoffee extends Drink {
    public BlackCoffee(final String item, final double price,
                       final String size, final boolean isIced) {
        super("Black Coffee", 4.5, size, isIced);
    }

    @Override
    public void prepare() {

    }

}
