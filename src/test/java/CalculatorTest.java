import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2, 3));
        assertEquals(0.0, calculator.add(-1, 1));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(2.0, calculator.subtract(5, 3));
        assertEquals(-8.0, calculator.subtract(2, 10));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(15.0, calculator.multiply(3, 5));
        assertEquals(-6.0, calculator.multiply(-2, 3));
    }
    
    @Test
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2));
        assertEquals(1.0, calculator.divide(10, 10));
    }
    
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
    
    @Test
    public void testModulo() {
        assertEquals(1.0, calculator.modulo(5, 2));
        assertEquals(0.0, calculator.modulo(10, 5));
    }
}
