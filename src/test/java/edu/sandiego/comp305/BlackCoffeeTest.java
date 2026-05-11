package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackCoffeeTest {
    @Test
    void testBlackCoffeePrice(){
        Drink blackCoffee = new BlackCoffee(false);
        assertEquals(4.5, blackCoffee.getPrice());
    }

    @Test
    void testBlackCoffeeHot(){
        Drink blackCoffee = new BlackCoffee(false);
        assertEquals("Black Coffee", blackCoffee.getItem());
    }

    @Test
    void testBlackCoffeeIced(){
        Drink blackCoffee = new BlackCoffee(false);
        assertEquals("Iced Black Coffee", blackCoffee.getItem());
    }
}