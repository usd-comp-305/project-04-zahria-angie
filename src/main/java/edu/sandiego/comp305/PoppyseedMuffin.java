package edu.sandiego.comp305;

public class PoppyseedMuffin extends MuffinFlavor{
    public PoppyseedMuffin(final Muffin muffin) {
        this.muffin = muffin;
    }

    @Override
    public String getDescription(){
        return "Poppyseed " + muffin.getDescription();
    }

    @Override
    public double getPrice(){
        return muffin.getPrice() + 4.00;
    }

    @Override
    public void prepare(){
        System.out.println("Adding poppyseeds...");
    }

}
