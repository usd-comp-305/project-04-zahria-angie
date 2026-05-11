package edu.sandiego.comp305;

public abstract class Muffin extends Food {
    protected String description;

    public abstract String getDescription();

    public abstract double getPrice();

    public abstract void prepare();
}
