package edu.sandiego.comp305;

public abstract class MuffinFlavor extends Muffin {

    protected Muffin muffin;

    public MuffinFlavor(final Muffin muffin) {
        this.muffin = muffin;
    }

    public abstract String getDescription();

    public abstract double getPrice();

    public abstract void prepare();

}

