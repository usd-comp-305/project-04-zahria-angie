package edu.sandiego.comp305;
import org.junit.jupiter.api.Test;

public class MuffinTests {
    @Test
    public void testBananaNutMuffin() {
        Muffin muffin = new ConcreteMuffin();
        muffin = new BananaNutMuffin(muffin);
        assert(muffin.getDescription().equals("Banana Nut Muffin"));
    }

    @Test
    public void testPoppySeedMuffin() {
        Muffin muffin = new ConcreteMuffin();
        muffin = new PoppyseedMuffin(muffin);
        assert(muffin.getDescription().equals("Poppyseed Muffin"));
    }

    @Test
    public void testPlainMuffin() {
        Muffin muffin = new ConcreteMuffin();
        assert(muffin.getDescription().equals("Muffin"));
    }

    @Test
    public void testPlainMuffinPrice() {
        Muffin muffin = new ConcreteMuffin();
        assert(muffin.getPrice() == 2.99);
    }

    @Test
    public void testBananaNutMuffinPrice() {
        Muffin muffin = new ConcreteMuffin();
        muffin = new BananaNutMuffin(muffin);
        assert(muffin.getPrice() == 5.99);
    }

    @Test
    public void testPoppyseedMuffinPrice() {
        Muffin muffin = new ConcreteMuffin();
        muffin = new PoppyseedMuffin(muffin);
        assert(muffin.getPrice() == 6.99);
    }
}
