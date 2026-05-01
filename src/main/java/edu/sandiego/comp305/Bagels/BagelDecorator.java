package edu.sandiego.comp305.Bagels;

public abstract class BagelDecorator implements Bagel{
    Bagel flavoredBagel;

    public BagelDecorator(Bagel bagel) {
        this.flavoredBagel = bagel;
    }

    @Override
    public String getDescription() {
        return flavoredBagel.getDescription();
    }

    @Override
    public double getPrice() {
        return flavoredBagel.getPrice();
    }
}
