
import org.junit.Test;
import org.example.Calculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.sum(2, 2));
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(4, 2));
    }

    @Test
    public void testDivByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.div(4, 0));
    }
}
