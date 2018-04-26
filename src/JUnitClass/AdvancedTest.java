package JUnitClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdvancedTest {
	
	// Please test using positive number, negative number and zero.
	private static OriginClass calculator = new OriginClass();
    @Before
    public void clearCalculator(){
        calculator.clear();
    }

    @Test
    public void square1() {
        calculator.square(2);
        assertEquals(4, calculator.getResult());
    }     

    @Test    
    public void square2(){
        calculator.square(0);
        assertEquals(0, calculator.getResult());
    }

    @Test    
    public void square3(){
        calculator.square(-3);
        assertEquals(9, calculator.getResult());
    }
}
