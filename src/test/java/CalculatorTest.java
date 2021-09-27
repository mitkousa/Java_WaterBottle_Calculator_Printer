import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator();}

    @Test
    public void canAdd(){
        assertEquals( 7, calculator.add(3, 4));
    }

    @Test
    public void canSubtract(){
        assertEquals( 1, calculator.subtract(4, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals( 15, calculator.multiply(3, 5));
    }

    @Test
    public void canDivide(){
        assertEquals( 1.2, calculator.divide(3, 2.5), 0.1);
    }
}
