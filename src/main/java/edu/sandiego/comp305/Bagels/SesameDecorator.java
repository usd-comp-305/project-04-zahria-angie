package edu.sandiego.comp305.Bagels;

public class SesameDecorator extends BagelDecorator {
    public SesameDecorator(final Bagel bagel) {
        super(bagel);
    }

    @Override
    public String getDescription() {
        return ("Sesame " + flavoredBagel.getDescription());
    }

    @Override
    public double getPrice() {
        return (flavoredBagel.getPrice() + 0.5);
    }
}
