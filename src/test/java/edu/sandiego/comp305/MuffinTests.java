package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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
        final Muffin muffin = new ConcreteMuffin();
        assert(muffin.getDescription().equals("Muffin"));
    }

    @Test
    public void testPlainMuffinPrice() {
        final Muffin muffin = new ConcreteMuffin();
        assertEquals(3.99, muffin.getPrice(), 0.001);
    }

    @Test
    public void testBananaNutMuffinPrice() {
        Muffin muffin = new ConcreteMuffin();
        muffin = new BananaNutMuffin(muffin);
        assertEquals(5.24, muffin.getPrice(), 0.001);
    }

    @Test
    public void testPoppyseedMuffinPrice() {
        Muffin muffin = new ConcreteMuffin();
        muffin = new PoppyseedMuffin(muffin);
        assertEquals(4.99, muffin.getPrice(), 0.001);
    }
}
