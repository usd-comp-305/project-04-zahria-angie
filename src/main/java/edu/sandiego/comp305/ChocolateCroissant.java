
package edu.sandiego.comp305;

public class ChocolateCroissant extends CroissantFlavor {
    public ChocolateCroissant(final Croissant croissant) {
        super(croissant);
    }

    @Override
    public String getDescription() {
        return "Chocolate " + croissant.getDescription();
    }

    @Override
    public double getPrice() {
        return croissant.getPrice() + 1.25;
    }

    @Override
    public void prepare() {
        croissant.prepare();
        System.out.println("Mixing in chocolate...");
    }
}
