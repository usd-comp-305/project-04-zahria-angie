package edu.sandiego.comp305.Bagels;

public class PlainBagel implements Bagel{
    @Override
    public String getDescription() {
        return "Bagel";
    }

    @Override
    public double getPrice() {
        return 3.0;
    }
}
