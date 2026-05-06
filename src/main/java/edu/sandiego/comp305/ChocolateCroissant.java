package edu.sandiego.comp305;

public class ChocolateCroissant extends CroissantFlavor {
    public ChocolateCroissant(final Croissant croissant){
        this.croissant = croissant;
    }

    @Override
    public String getDescription() {
        return "Chocolate " + croissant.getDescription();
    }

    @Override
    public double getPrice() {
        return croissant.getPrice() + 3.00;
    }
}
