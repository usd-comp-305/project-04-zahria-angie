package edu.sandiego.comp305;

public abstract class Food {
    double price;

    public Food(final double price) {
        this.price = price;
    }


    public abstract double price();
}
