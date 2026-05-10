
package edu.sandiego.comp305;

public class BlueberryBagel extends BagelFlavor {
    public BlueberryBagel(final Bagel bagel) {
        super(bagel);
    }

    @Override
    public String getDescription() {
        return "Blueberry " + bagel.getDescription();
    }

    @Override
    public double getPrice() {
        return bagel.getPrice() + 0.75;
    }

    @Override
    public void prepare() {
        bagel.prepare();
        System.out.println("Adding blueberries...");
    }
}
