import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    WaterBottle waterBottle;
    @Before
    public void before() { waterBottle = new WaterBottle(100);}

    @Test
    public void canDrink(){
        assertEquals(90, waterBottle.Drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterBottle.Empty());
    }
    @Test
    public void canFill(){
        assertEquals(100, waterBottle.Fill());
    }
}
