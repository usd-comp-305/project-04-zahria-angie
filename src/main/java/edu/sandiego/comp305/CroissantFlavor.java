package edu.sandiego.comp305;


public abstract class CroissantFlavor extends Croissant {
    Croissant croissant;

    public abstract String getDescription();

    public abstract double getPrice();

    public abstract void prepare();

}
