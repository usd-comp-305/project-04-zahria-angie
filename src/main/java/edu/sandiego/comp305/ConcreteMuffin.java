
package edu.sandiego.comp305;

public class ConcreteMuffin extends Muffin {
    public ConcreteMuffin() {
        this.description = "Muffin";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return 3.99;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing muffin...");
    }
}
