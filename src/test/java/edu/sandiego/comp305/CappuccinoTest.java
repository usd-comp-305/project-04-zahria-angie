package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CappuccinoTest {
    @Test
    void testCappuccinoPrice(){
        final Drink cappuccino = new Cappuccino(false);
        assertEquals(5.5, cappuccino.getPrice());
    }

    @Test
    void testCappuccinoHot(){
        final Drink cappuccino = new Cappuccino(false);
        assertEquals("Cappuccino", cappuccino.getItem());
    }
}
