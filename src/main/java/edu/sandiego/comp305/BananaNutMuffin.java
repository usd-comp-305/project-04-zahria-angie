package edu.sandiego.comp305;

public class BananaNutMuffin extends MuffinFlavor{
    public BananaNutMuffin(final Muffin muffin){
        this.muffin = muffin;
    }

    @Override
    public String getDescription(){
        return "Banana Nut " + muffin.getDescription();
    }

    @Override public double getPrice(){
        return muffin.getPrice() + 3.00;
    }
}
