package edu.sandiego.comp305;

public class BlackCoffee extends Drink {
    public BlackCoffee(boolean isIced) {
        super("Black Coffee", 4.5, isIced);
    }

    @Override
    public void prepare() {
        System.out.println("Brewing " + getItem() + "...");
    }

}
