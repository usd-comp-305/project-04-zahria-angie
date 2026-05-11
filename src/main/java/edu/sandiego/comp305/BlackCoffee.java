package edu.sandiego.comp305;

public class BlackCoffee extends Drink {
    public BlackCoffee(final boolean isIced) {
        super("Black Coffee", 4.5, isIced);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Brewing coffee beans");
    }

}
