
package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashPaymentTests {

    @Test
    public void testExactAmount() {
        final CashPayment cash = new CashPayment();
        assertDoesNotThrow(() -> cash.processPayment(10.00, 10.00));
    }

    @Test
    public void testOverPayment() {
        final CashPayment cash = new CashPayment();
        assertDoesNotThrow(() -> cash.processPayment(10.00, 15.00));
    }

    @Test
    public void testZeroTotal() {
        final CashPayment cash = new CashPayment();
        assertDoesNotThrow(() -> cash.processPayment(0.00, 0.00));
    }
}
