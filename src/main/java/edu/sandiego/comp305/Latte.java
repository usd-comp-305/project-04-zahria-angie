package edu.sandiego.comp305;

public class Latte extends Drink {

    public Latte(final boolean isIced) {
        super("Latte", 5, isIced);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Espresso + Steamed Milk");
    }
}
