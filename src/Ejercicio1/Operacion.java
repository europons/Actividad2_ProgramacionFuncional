package Ejercicio1;

/**
 * Interfaz funcional que representa una operación matemática
 * entre dos números enteros.
 */
@FunctionalInterface
public interface Operacion {
    /**
     * Aplica la operación a dos enteros.
     *
     * @param a primer número
     * @param b segundo número
     * @return resultado de la operación
     */
    int aplicar(int a, int b);
}
