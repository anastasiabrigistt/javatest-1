
import org.junit.Test;

import static org.example.Calculator.sum;
import static org.example.Calculator.div;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    public void testSumPositiveNumbers() {
        assertEquals(5, sum(2, 3));
    }

    @Test
    public void testSumNegativeNumbers() {
        assertEquals(-5, sum(-2, -3));
    }

    @Test
    public void testSumZero() {
        assertEquals(2, sum(2, 0));
    }

    @Test
    public void testDivPositiveNumbers() {

        assertEquals(2, div(4, 2));
    }

    @Test
    public void testDivNegativeNumbers() {

        assertEquals(-2, div(4, -2));
    }

    @Test
    public void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> div(4, 0));
    }
}
