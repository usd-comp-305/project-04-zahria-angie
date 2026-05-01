package edu.sandiego.comp305.Bagels;

public class BlueberryDecorator extends BagelDecorator {
    public BlueberryDecorator(Bagel bagel) {
        super(bagel);
    }

    @Override
    public String getDescription() {
        return ("Blueberry " + flavoredBagel.getDescription());
    }

    @Override
    public double getPrice() {
        return (flavoredBagel.getPrice() + 0.5);
    }
}
