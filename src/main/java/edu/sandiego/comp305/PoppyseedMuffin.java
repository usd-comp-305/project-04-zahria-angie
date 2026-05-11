
package edu.sandiego.comp305;

public class PoppyseedMuffin extends MuffinFlavor {
    public PoppyseedMuffin(final Muffin muffin) {
        super(muffin);
    }

    @Override
    public String getDescription() {
        return "Poppyseed " +  muffin.getDescription();
    }

    @Override
    public double getPrice() {
        return muffin.getPrice() + 1.00;
    }

    @Override
    public void prepare() {
        muffin.prepare();
        System.out.println("Sprinkling poppyseeds...");
    }
}
