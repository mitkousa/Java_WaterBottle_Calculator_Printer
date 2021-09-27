import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;
    @Before
    public void before() {printer = new Printer(420);}

    @Test
    public void canPrint(){
        assertEquals(6, printer.Print(2, 3));
    }
}
