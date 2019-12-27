package PruebaPilotoMonte.PruebaPilotoMonte;

import static org.junit.Assert.*;



public class CalcTest {

	
	public void testSuma() {
		Calculadora calc= new Calculadora();
		double a = 10;
		double b= 2;
		double resultadoEsperado = 10;
		
		assertEquals(resultadoEsperado, calc.suma(a, b), 0);
		
	}

	

}