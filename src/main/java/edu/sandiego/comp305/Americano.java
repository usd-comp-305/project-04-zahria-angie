package edu.sandiego.comp305;

public class Americano extends Drink {

    public Americano(String item, double price, String size, boolean isIced) {
        super("Americano", 4.5, size, isIced);
    }

    @Override
    public void prepare() {

    }
}
