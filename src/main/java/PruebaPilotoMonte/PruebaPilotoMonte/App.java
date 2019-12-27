package PruebaPilotoMonte.PruebaPilotoMonte;

/**
 * Prueba de clocación de proyecto desde Git y Creación de calculadora
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        Calculadora calculadora = new Calculadora();
        
        double resultadoSuma = calculadora.suma(10, 10);
        System.out.println( "El resultado de la suma es: " + resultadoSuma );
        
        
        double resultadoResta = calculadora.resta(10, 5);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        
        double resultadoMultiplicacion = calculadora.multiplica(10, 5);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
        
        double resultadoDivision = calculadora.divide(10, 5);
        System.out.println("El resultado de la división es: " + resultadoDivision);
        
        
    }
}
