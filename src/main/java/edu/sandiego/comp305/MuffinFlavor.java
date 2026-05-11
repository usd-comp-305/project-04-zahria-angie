package edu.sandiego.comp305;

public abstract class MuffinFlavor extends Muffin {
    Muffin muffin;

    public abstract String getDescription();

    public abstract double getPrice();

    public abstract void prepare();
}
