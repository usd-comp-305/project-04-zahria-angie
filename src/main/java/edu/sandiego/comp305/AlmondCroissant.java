
package edu.sandiego.comp305;

public class AlmondCroissant extends CroissantFlavor {
    public AlmondCroissant(final Croissant croissant) {
        super(croissant);
    }

    @Override
    public String getDescription() {
        return "Almond " +  croissant.getDescription();
    }

    @Override
    public double getPrice() {
        return croissant.getPrice() + 1.50;
    }

    @Override
    public void prepare() {
        croissant.prepare();
        System.out.println("Placing almonds...");
    }
}
