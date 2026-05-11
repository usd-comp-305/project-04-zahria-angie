
package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardPaymentTests {

    @Test
    public void testExactAmount() {
        final CardPayment card = new CardPayment();
        assertDoesNotThrow(() -> card.processPayment(10.00, 10.00));
    }

    @Test
    public void testLargeAmount() {
        final CardPayment card = new CardPayment();
        assertDoesNotThrow(() -> card.processPayment(100.00, 100.00));
    }

    @Test
    public void testZeroTotal() {
        final CardPayment card = new CardPayment();
        assertDoesNotThrow(() -> card.processPayment(0.00, 0.00));
    }
}
