package Ejercicio2;

/**
 * Clase abstracta que representa un vehículo genérico.
 * Obliga a implementar el método {@link #arrancar()} en las subclases.
 */
public abstract class Vehiculo {
    /**
     * Método abstracto que debe ser implementado por las subclases
     * para definir cómo arrancar el vehículo.
     */
    public abstract void arrancar();
}
