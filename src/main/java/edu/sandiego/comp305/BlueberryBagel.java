package edu.sandiego.comp305;

public class BlueberryBagel extends BagelFlavor{
    public BlueberryBagel(final Bagel bagel) {
        this.bagel = bagel;
    }

    @Override
    public String getDescription(){
        return "Blueberry " + bagel.getDescription();

    }

    @Override
    public double getPrice(){
        return bagel.getPrice() + 3.00;
    }
}
