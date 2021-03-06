package PruebaPilotoMonte.PruebaPilotoMonte;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
   
	public void testSuma() {
		Calculadora calc= new Calculadora();
		double a = 10;
		double b= 2;
		double resultadoEsperado = 12;
		
		assertEquals(resultadoEsperado, calc.suma(a, b), 0);
		
	}
	
	public void testResta()
	{
		Calculadora calc= new Calculadora();
		double a= 5;
		double b = 2;
		double resultadoEsperado = 3;
		
		assertEquals(resultadoEsperado, calc.resta(a, b), 0);
	}
	
	public void testMultiplica()
	{
		Calculadora calc= new Calculadora();
		double a= 5;
		double b = 2;
		double resultadoEsperado = 10;
		
		assertEquals(resultadoEsperado, calc.multiplica(a, b), 0);
	}
	

}
