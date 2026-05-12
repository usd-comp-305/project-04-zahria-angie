package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void emptyOrderTotalTest(){
        final Order order = new Order("TestUser");
        assertEquals(0.0, order.calculateTotal());
    }

    @Test
    void singleDrinkTotalTest(){
        final Order order = new Order("TestUser");
        order.addDrink(new Latte(false));
        assertEquals(5.0, order.calculateTotal());
    }

    @Test
    void multipleDrinksTotalTest(){
        final Order order = new Order("TestUser");
        order.addDrink(new Latte(false));
        order.addDrink(new Americano(true));
        assertEquals(9.5, order.calculateTotal());
    }

    @Test
    void multipleFoodItemsTotalTest(){
        final Order order = new Order("TestUser");
        Muffin muffin = new ConcreteMuffin();
        muffin = new BananaNutMuffin((Muffin) muffin);

        Bagel bagel = new ConcreteBagel();
        bagel = new EverythingBagel((Bagel) bagel);

        order.addFood(muffin);
        order.addFood(bagel);

        assertEquals(muffin.getPrice() + bagel.getPrice(),
                order.calculateTotal());
    }

    @Test
    void drinkAndFoodTotalTest(){
        final Order order = new Order("TestUser");
        Muffin muffin = new ConcreteMuffin();
        muffin = new BananaNutMuffin((Muffin) muffin);
        order.addFood(muffin);

        order.addDrink(new Americano(true));

        assertEquals(9.74, order.calculateTotal(), 0.01);
    }

    @Test
    void receiptTest(){
        final Order order = new Order("TestUser");
        order.addDrink(new Latte(false));
        order.addDrink(new Americano(true));
        assertDoesNotThrow(order::printReceipt);
    }

    @Test
    void emptyReceiptTest(){
        final Order order = new Order("TestUser");
        assertDoesNotThrow(order::printReceipt);
    }

    @Test
    public void receiptDoesNotCrashTest() {
        final Order order = new Order("TestUser");
        order.addDrink(new Latte(false));

        Bagel bagel = new ConcreteBagel();
        bagel = new EverythingBagel((Bagel) bagel);
        order.addFood(bagel);

        assertDoesNotThrow(order::printReceipt);
    }

    @Test
    public void prepareOrderDoesNotCrashTest() {
        final Order order = new Order("TestUser");
        order.addDrink(new Latte(false));
        order.addDrink(new Americano(true));

        assertDoesNotThrow(order::prepareOrder);
    }
}
