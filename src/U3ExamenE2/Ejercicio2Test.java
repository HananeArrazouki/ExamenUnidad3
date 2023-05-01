package U3ExamenE2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio2Test {

	//---------------------------------------------------------------------------
	@Test
	public final void testFactorial() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		int result = calc.factorial();
		assertEquals(2, result);
	}
	@Test
	public final void testFactorial2() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		int result = calc.factorial();
		assertEquals("ERROR",1, result);
	}
	//---------------------------------------------------------------------------
	@Test
	public final void testLessOfZero() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		boolean result = calc.lessOfZero(-1);
		assertTrue(result);
	}
	@Test
	public final void testLessOfZero2() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		boolean result = calc.lessOfZero(1);
		assertTrue("ERROR",result);
	}
	@Test
	public final void testLessOfZero3() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		boolean result = calc.lessOfZero(1);
		assertFalse(result);
	}
	@Test
	public final void testLessOfZero4() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		boolean result = calc.lessOfZero(-1);
		assertFalse("ERROR",result);
	}

	//---------------------------------------------------------------------------
	@Test
	public final void testArithmeticMean() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		int result = calc.arithmeticMean();
		assertEquals(3, result);
	}
	@Test
	public final void testArithmeticMean2() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		int result = calc.arithmeticMean();
		assertEquals("ERROR",4, result);
	}

	//---------------------------------------------------------------------------
	@Test
	public final void testConcatenate() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		int result = calc.concatenate();
		assertEquals(24, result);
	}
	@Test
	public final void testConcatenate2() {
		Ejercicio2 calc = new Ejercicio2(2,4);
		int result = calc.concatenate();
		assertEquals("ERROR",22, result);
	}
}