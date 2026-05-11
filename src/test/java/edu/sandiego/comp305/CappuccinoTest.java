package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CappuccinoTest {
    @Test
    void testCappuccinoPrice(){
        Drink cappuccino = new Cappuccino(false);
        assertEquals(5.5, cappuccino.getPrice());
    }

    @Test
    void testCappuccinoHot(){
        Drink cappuccino = new Cappuccino(false);
        assertEquals("Cappuccino", cappuccino.getItem());
    }

    @Test
    void testCappuccinoIced(){
        Drink cappuccino = new Cappuccino(false);
        assertEquals("Iced Cappuccino", cappuccino.getItem());
    }
}