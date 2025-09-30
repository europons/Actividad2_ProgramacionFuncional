package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que ejecuta el programa de gestión de libros.
 * Permite al usuario ordenar una lista de libros por distintos criterios.
 */
public class MainEjercicio3 {
    /** Constante que representa la opción de salida del menú. */
    private static final String OPCIONES_MENU = "4";

    /**
     * Método principal que inicializa los datos de ejemplo,
     * prepara la gestión de libros y lanza el flujo de la aplicación.
     */
    public static void main(String[] args) {
        GestionLibros gestionLibros = new GestionLibros();
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Libro libro3 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 576);
        Libro libro4 = new Libro("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", 348);
        Libro libro5 = new Libro("La Ciudad y los Perros", "Mario Vargas Llosa", 384);
        Libro libro6 = new Libro("Ficciones", "Jorge Luis Borges", 224);
        Libro libro7 = new Libro("Rayuela", "Julio Cortázar", 576);
        Libro libro8 = new Libro("Pedro Páramo", "Juan Rulfo", 124);
        Libro libro9 = new Libro("El Aleph", "Jorge Luis Borges", 144);
        Libro libro10 = new Libro("La Casa de los Espíritus", "Isabel Allende", 433);

        ArrayList<Libro> libros = new ArrayList<>();
        gestionLibros.agregarLibro(libros, libro1);
        gestionLibros.agregarLibro(libros, libro2);
        gestionLibros.agregarLibro(libros, libro3);
        gestionLibros.agregarLibro(libros, libro4);
        gestionLibros.agregarLibro(libros, libro5);
        gestionLibros.agregarLibro(libros, libro6);
        gestionLibros.agregarLibro(libros, libro7);
        gestionLibros.agregarLibro(libros, libro8);
        gestionLibros.agregarLibro(libros, libro9);
        gestionLibros.agregarLibro(libros, libro10);

        Scanner entrada = new Scanner(System.in);
        flujoAplicacion(entrada, gestionLibros, libros);
        entrada.close();
    }

    /**
     * Controla el flujo principal de la aplicación, mostrando el menú
     * y ejecutando las acciones seleccionadas por el usuario.
     *
     * @param entrada       scanner para la entrada de datos
     * @param gestionLibros objeto encargado de gestionar los libros
     * @param libros        lista de libros
     */
    private static void flujoAplicacion (Scanner entrada, GestionLibros gestionLibros, ArrayList<Libro> libros){
        String opcion;

        do {
            opcion= menu(entrada); //Mostrar menú y leer opción
            switch (opcion){
                case "1":
                    gestionLibros.ordenarPorPaginas(libros);
                    break;
                case "2":
                    gestionLibros.ordenarPorTitulo(libros);
                    break;
                case "3":
                    gestionLibros.ordenarPorAutorDescendente(libros);
                    break;
                case "4":
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida ⚠️");
                    break;
            }
        }while(!opcion.equals(OPCIONES_MENU));
    }

    /**
     * Muestra el menú de opciones por consola y devuelve
     * la opción seleccionada por el usuario.
     *
     * @param entrada Scanner para la lectura de la opción.
     * @return String con la opción elegida por el usuario.
     */
    private static String menu(Scanner entrada) {
        System.out.println("\n📖 ===== ORDENAR LIBROS ===== 📖");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("1. Ordenar por número de páginas ascendente (CLASE ANÓNIMA).");
        System.out.println("2. Ordenar por título alfabéticamente (EXPRESIÓN LAMBDA).");
        System.out.println("3. Ordenar por autor en orden descendente (COMPARATOR.COMPARING Y REVERSED).");
        System.out.println("4. SALIR. 🔚");

        System.out.print("Introduce una opción: ");
        return entrada.nextLine();
    }
}
