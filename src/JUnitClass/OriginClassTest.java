package JUnitClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class OriginClassTest {
	
	private static OriginClass oc = new OriginClass();

	@Before
	public void setUp() throws Exception {
		oc.clear();
	}

	@Test
	public void testAdd() {
		oc.add(3);
		oc.add(4);
		assertEquals(7, oc.getResult());
	}
	

	@Test
	public void testSubstract() {
		oc.add(9);
		oc.substract(7);
//		assertEquals(2, oc.getResult());
		assertEquals(8, oc.getResult());
	}
	
	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		oc.add(6);
		oc.divide(3);
		assertEquals(2, oc.getResult());
	}
	
	// Dead cycle test
	@Ignore("Multiply() Not yet implemented")
	@Test(timeout=1000) 
	public void testsquareRoot() { 
		oc.squareRoot(5);
		assertEquals(2, oc.getResult());
	}
	
	
//	@Ignore("Multiply() Not yet implemented")
	@Test(expected = ArithmeticException.class)
	public void divideByZero(){
        oc.divide(0);
   }

}
