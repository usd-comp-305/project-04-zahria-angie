package edu.sandiego.comp305;

public class EverythingBagel extends BagelFlavor{
    public EverythingBagel(Bagel bagel) {

        this.bagel = bagel;
    }

    @Override
    public String getDescription() {
        return "Everything " + bagel.getDescription();
    }

    @Override
    public double getPrice() {

        return bagel.getPrice() + 3.00;
    }
}
