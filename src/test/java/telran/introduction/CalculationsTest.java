package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static telran.introduction.Calculations.*;

public class CalculationsTest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
        assertEquals(-2, sum(-1, -1));
        assertEquals(0, sum(0, 0));
    }
    @Test
    void multiplyTest() {
        assertEquals(4, multiply(2, 2));
    }
    @Test
    void divideTest() {
        assertEquals(2, divide(4, 2));
        assertThrowsExactly(ArithmeticException.class, () -> divide(10, 0));
    }
    @Test
    void subtractTest() {
        assertEquals(1, subtract(2, 1));
    }
    @Test
    void sumOfDigitsTest() {
        assertEquals(6, sumOfDigits(123));
        assertEquals(6, sumOfDigits(-123));
    }
    @Test
    void maxDigitsTest() {
        assertEquals(3, maxDigit(123));
        assertEquals(5, maxDigit(145032));
        assertEquals(5, maxDigit(-145023));
    }
    @Test
    void isDividedOnTest() {
        assertTrue(isDividedOn(12, 3));
        assertFalse(isDividedOn(-4, -3));
        assertFalse(isDividedOn(10, 0));
    }
}