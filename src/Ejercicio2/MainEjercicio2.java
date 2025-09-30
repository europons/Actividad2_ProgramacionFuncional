package Ejercicio2;

/**
 * Clase principal que ejecuta el programa del Ejercicio 2.
 * Demuestra el uso de interfaces mediante clases anónimas.
 */
public class MainEjercicio2 {

    /**
     * Método principal que crea instancias anónimas de {@link Saludable}
     * y {@link Vehiculo} para mostrar ejemplos de uso.
     */
    public static void main(String[] args) {

        // Instancia anónima de Saludable con consejo de alimentación
        Saludable alimentacionSaludable = new Saludable() {
            @Override
            public void mostrarConsejo() {
                System.out.println("\nConsejo sobre alimentación: Come frutas y verduras diariamente.");
            }
        };
        alimentacionSaludable.mostrarConsejo();

        // Instancia anónima de Saludable con consejo de ejercicio
        Saludable ejercicioSaludable = new Saludable() {
            @Override
            public void mostrarConsejo() {
                System.out.println("\nConsejo sobre ejercicio: Realiza al menos 30 minutos de actividad física al día.");
            }
        };
        ejercicioSaludable.mostrarConsejo();

        // Instancia anónima de Vehiculo que representa un coche
        Vehiculo coche = new Vehiculo() {
            @Override
            public void arrancar() {
                System.out.println("\nEl coche está arrancando.");
            }
        };
        coche.arrancar();
    }
}
