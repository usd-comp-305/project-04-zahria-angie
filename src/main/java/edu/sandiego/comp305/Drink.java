package edu.sandiego.comp305;

public abstract class Drink {

    String item;

    double price;

    String size; // small, medium, large

    boolean isIced;

    public Drink(final String item, final double price,
                 final String size, final boolean isIced) {
        this.item = item;
        this.price = price;
        this.size = size;
        this.isIced = isIced;
    }

    public abstract void prepare();

    public double getPrice() {
        return price;
    }

    public String getItem() {
        return item;
    }

    public String getSize() {
        return size;
    }

    public boolean getIsIced() {
        return isIced;
    }
}
