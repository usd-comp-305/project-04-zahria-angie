package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {
    @Test
    void testAmericanoPrice(){
        Drink americano = new Americano(false);
        assertEquals(4.5, americano.getPrice());
    }

    @Test
    void testAmericanoHot(){
        Drink americano = new Americano(false);
        assertEquals("Americano", americano.getItem());
    }

    @Test
    void testAmericanoIced(){
        Drink americano = new Americano(false);
        assertEquals("Iced Americano", americano.getItem());
    }
}