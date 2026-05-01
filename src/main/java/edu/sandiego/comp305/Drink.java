package edu.sandiego.comp305;

public abstract class Drink {

    private final String item;

    private final double price;

    private final boolean isIced;

    public Drink( String item,  double price, boolean isIced) {
        this.item = item;
        this.price = price;
        this.isIced = isIced;
    }

    public abstract void prepare();

    public double getPrice() {
        return price;
    }

    public String getItem() {
        return isIced ? item + " (Iced)" : item;
    }

}
