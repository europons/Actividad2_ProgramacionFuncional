package Ejercicio1;

import java.util.Scanner;

/**
 * Clase principal que demuestra el uso de la interfaz funcional {@link Operacion}
 * mediante clases anónimas y expresiones lambda para realizar operaciones matemáticas.
 */
public class MainEjercicio1 {

    /**
     * Método principal que ejecuta ejemplos de suma, resta y multiplicación
     * usando {@link Operacion}.
     */
    public static void main(String[] args) {

        sumaConAnonima();
        sumaConLambda();
        restaConLambda();
        multiplicacionConLambda();

    }

    /**
     * Pide un número entero por consola y valida la entrada.
     *
     * @return número entero introducido por el usuario
     */
    public static int introducirNumero(){
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Introduce un número: ");
            try {
                num1 = entrada.nextInt();  
                valido = true;             
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número entero.");
                entrada.nextLine(); 
            }
        }
        return num1;
    }

    /**
     * Realiza una suma usando una clase anónima que implementa {@link Operacion}.
     */
    public static void sumaConAnonima(){
        Operacion operacion = new Operacion() {
            @Override
            public int aplicar(int a, int b) {
                return a+b;
            }
        };

        int num1 = introducirNumero();
        int num2 = introducirNumero();

        int resultado = operacion.aplicar(num1, num2);
        System.out.println("El resultado de la suma con CLASE ANÓNIMA es: " + resultado);
    }

    /**
     * Realiza una suma usando una expresión lambda que implementa {@link Operacion}.
     */
    public static void sumaConLambda(){
        Operacion operacion = (a, b) -> a + b;

        int num1 = introducirNumero();
        int num2 = introducirNumero();

        int resultado = operacion.aplicar(num1, num2);
        System.out.println("El resultado de la suma CON LAMBDA es: " + resultado);
    }

    /**
     * Realiza una resta usando una expresión lambda que implementa {@link Operacion}.
     */
    public static void restaConLambda(){
        Operacion operacion = (a, b) -> a - b;

        int num1 = introducirNumero();
        int num2 = introducirNumero();

        int resultado = operacion.aplicar(num1, num2);
        System.out.println("El resultado de la resta CON LAMBDA es: " + resultado);
    }

    /**
     * Realiza una multiplicación usando una expresión lambda que implementa {@link Operacion}.
     */
    public static void multiplicacionConLambda(){
        Operacion operacion = (a, b) -> a * b;

        int num1 = introducirNumero();
        int num2 = introducirNumero();

        int resultado = operacion.aplicar(num1, num2);
        System.out.println("El resultado de la multiplicación CON LAMBDA es: " + resultado);
    }
}
