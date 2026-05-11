
package edu.sandiego.comp305;

public abstract class BagelFlavor extends Bagel {
    protected Bagel bagel;

    public BagelFlavor(final Bagel bagel) {
        this.bagel = bagel;
    }

    public abstract String getDescription();

    public abstract double getPrice();

    public abstract void prepare();
}
