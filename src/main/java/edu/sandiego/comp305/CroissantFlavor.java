
package edu.sandiego.comp305;

public abstract class CroissantFlavor extends Croissant {
    protected Croissant croissant;

    public CroissantFlavor(final Croissant croissant) {
        this.croissant = croissant;
    }

    public abstract String getDescription();

    public abstract double getPrice();

    public abstract void prepare();
}
