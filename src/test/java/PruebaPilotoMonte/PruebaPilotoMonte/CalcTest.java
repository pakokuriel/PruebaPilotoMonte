package PruebaPilotoMonte.PruebaPilotoMonte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testSuma() {
		Calculadora calc= new Calculadora();
		double a = 10;
		double b= 2;
		double resultadoEsperado = 10;
		
		assertEquals(resultadoEsperado, calc.suma(a, b), 0);
		
	}

	@Test
	public void testResta() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplica() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
