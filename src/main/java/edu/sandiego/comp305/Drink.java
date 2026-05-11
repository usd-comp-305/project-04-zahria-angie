package edu.sandiego.comp305;

public abstract class Drink {

    private final String item;

    private final double price;

    private final boolean isIced;

    public Drink(final String item,  final double price, final boolean isIced) {
        this.item = item;
        this.price = price;
        this.isIced = isIced;
    }

    public void prepare() {
        System.out.println("Preparing " + getItem() + "...");
    }

    public double getPrice() {
        return price;
    }

    public String getItem() {
        if (isIced) {
            return ("Iced " + item);
        } else {
            return item;
        }
    }
}
