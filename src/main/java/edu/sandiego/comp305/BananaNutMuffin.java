
package edu.sandiego.comp305;

public class BananaNutMuffin extends MuffinFlavor {
    public BananaNutMuffin(final Muffin muffin) {
        super(muffin); 
    }

    @Override
    public String getDescription() {
        return "Banana Nut " +  muffin.getDescription();
    }

    @Override
    public double getPrice() {
        return muffin.getPrice() + 1.25;
    }

    @Override
    public void prepare() {
        muffin.prepare();
        System.out.println("Adding bananas and nuts...");
    }
}
