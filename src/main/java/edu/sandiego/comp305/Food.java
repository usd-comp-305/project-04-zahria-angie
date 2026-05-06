package edu.sandiego.comp305;

public abstract class Food {
    private final String item;

    private final double price;

    private final String flavor;

    public Food(final String name, final String flavor, final double price) {
        this.item = name; //user input
        this.flavor = flavor; //user input
        this.price = price; //predetermined
    }

    public String getItem() {
        return item;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }
}
