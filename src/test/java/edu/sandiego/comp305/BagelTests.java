package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagelTests {
    @Test
    public void testBlueberryBagel() {
        Bagel bagel = new ConcreteBagel();
        bagel = new BlueberryBagel(bagel);
        assert(bagel.getDescription().equals("Blueberry Bagel"));
    }

    @Test
    public void testEverythingBagel() {
        Bagel bagel = new ConcreteBagel();
        bagel = new EverythingBagel(bagel);
        assert(bagel.getDescription().equals("Everything Bagel"));
    }

    @Test
    public void testPlainBagel() {
        final Bagel bagel = new ConcreteBagel();
        assert(bagel.getDescription().equals("Bagel"));
    }

    @Test
    public void testPlainBagelPrice() {
        final Bagel bagel = new ConcreteBagel();
        assertEquals(2.99, bagel.getPrice(), 0.01);
    }

    @Test
    public void testBlueberryBagelPrice() {
        Bagel bagel = new ConcreteBagel();
        bagel = new BlueberryBagel(bagel);
        assertEquals(4.99, bagel.getPrice(), 0.01);

    }

    @Test
    public void testEverythingBagelPrice() {
        Bagel bagel = new ConcreteBagel();
        bagel = new EverythingBagel(bagel);
        assertEquals(5.99, bagel.getPrice() , 0.01);
    }
}
