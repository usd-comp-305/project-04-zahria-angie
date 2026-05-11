
package edu.sandiego.comp305;

public class EverythingBagel extends BagelFlavor {
    public EverythingBagel(final Bagel bagel) {
        super(bagel);
    }

    @Override
    public String getDescription() {
        return "Everything " +  bagel.getDescription();
    }

    @Override
    public double getPrice() {
        return bagel.getPrice() + 0.90;
    }

    @Override
    public void prepare() {
        bagel.prepare();
        System.out.println("Adding everything bagel seasoning...");
    }

}
