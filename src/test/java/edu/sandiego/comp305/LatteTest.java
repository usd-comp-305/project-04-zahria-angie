package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LatteTest {
    @Test
    void testLattePrice(){
        Drink latte = new Latte(false);
        assertEquals(5.0, latte.getPrice());
    }

    @Test
    void testLatteHot(){
        Drink latte = new Latte(false);
        assertEquals("Latte", latte.getItem());
    }

    @Test
    void testLatteIced(){
        Drink latte = new Latte(false);
        assertEquals("Iced Latte", latte.getItem());
    }
}
