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
        return bagel.getPrice() + 2.00;
    }

    @Override
    public void prepare() {
        System.out.println("Adding blueberries...");
    }
}
