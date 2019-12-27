package PruebaPilotoMonte.PruebaPilotoMonte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calc= new Calculadora();
		double a = 10;
		double b= 2;
		double resultadoEsperado = 12;
		
		assertEquals(resultadoEsperado, calc.suma(a, b), 0);
		
	}

	

}
