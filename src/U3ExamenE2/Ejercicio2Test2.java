package U3ExamenE2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Ejercicio2Test2 {

	private int result;
	private boolean result1;
	private Ejercicio2 calc;
	
	@Before
	public void createEjercicio2() {
		calc = new Ejercicio2(2,4);
	}

	//---------------------------------------------------------------------------
	@Test
	public final void testFactorial() {
		result = calc.factorial();
		assertEquals(2, result);
	}
	@Test
	public final void testFactorial1() {
		result = calc.factorial();
		assertEquals("ERROR",3, result);
	}
	//---------------------------------------------------------------------------
	@Test
	public final void testLessOfZero() {
		result1 = calc.lessOfZero(-1);
		assertTrue(result1);
	}
	@Test
	public final void testLessOfZero2() {
		result1 = calc.lessOfZero(1);
		assertTrue("ERROR",result1);
	}
	@Test
	public final void testLessOfZero3() {
		result1 = calc.lessOfZero(-1);
		assertFalse(result1);
	}
	@Test
	public final void testLessOfZero4() {
		result1 = calc.lessOfZero(1);
		assertTrue("ERROR",result1);
	}

	//---------------------------------------------------------------------------
	@Test
	public final void testArithmeticMean() {
		result = calc.arithmeticMean();
		assertEquals(3, result);
	}
	@Test
	public final void testArithmeticMean2() {
		result = calc.arithmeticMean();
		assertEquals("ERROR",2, result);
	}

	//---------------------------------------------------------------------------
	@Test
	public final void testConcatenate() {
		result = calc.concatenate();
		assertEquals(24, result);
	}
	@Test
	public final void testConcatenate2() {
		result = calc.concatenate();
		assertEquals("ERROR",25, result);
	}
}