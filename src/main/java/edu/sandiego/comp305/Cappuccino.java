package edu.sandiego.comp305;

public class Cappuccino extends Drink {

    public Cappuccino(final boolean isIced) {
        super("Cappuccino", 5.5, false);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Espresso + Steamed Milk + Foam");
    }

}
