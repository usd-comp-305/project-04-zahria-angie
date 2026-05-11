package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CroissantTests {
    @Test
    public void testChocolateCroissant() {
        Croissant croissant = new ConcreteCroissant();
        croissant = new ChocolateCroissant(croissant);
        assert(croissant.getDescription().equals("Chocolate Croissant"));
    }

    @Test
    public void testAlmondCroissant() {
        Croissant croissant = new ConcreteCroissant();
        croissant = new AlmondCroissant(croissant);
        assert(croissant.getDescription().equals("Almond Croissant"));
    }

    @Test
    public void testPlainCroissant() {
        final Croissant croissant = new ConcreteCroissant();
        assert(croissant.getDescription().equals("Croissant"));
    }

    @Test
    public void testPlainCroissantPrice() {
        final Croissant croissant = new ConcreteCroissant();
        assertEquals(4.99, croissant.getPrice(), 0.001);
    }

    @Test
    public void testAlmondCroissantPrice() {
        Croissant croissant = new ConcreteCroissant();
        croissant = new AlmondCroissant(croissant);
        assertEquals(6.49, croissant.getPrice(), 0.001);
    }

    @Test
    public void testChocolateCroissantPrice() {
        Croissant croissant = new ConcreteCroissant();
        croissant = new ChocolateCroissant(croissant);
        assertEquals(6.24, croissant.getPrice(), 0.001);
    }




}
