package Ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Clase que gestiona una colección de libros.
 * Permite agregarlos, mostrarlos y ordenarlos por distintos criterios.
 */

public class GestionLibros {

    /**
     * Constructor de la clase.
     */
    public GestionLibros() {
    }

    /**
     * Agrega un libro a la lista.
     *
     * @param libros lista de libros
     * @param libro  libro a agregar
     */
    public void agregarLibro(ArrayList<Libro> libros, Libro libro) {
        libros.add(libro);
    }

    /**
     * Muestra todos los libros de la lista.
     *
     * @param libros lista de libros
     */
    public void mostrarLibros(ArrayList<Libro> libros) {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    /**
     * Ordena los libros por número de páginas en orden ascendente.
     *
     * @param libros lista de libros
     */
    public void ordenarPorPaginas(ArrayList<Libro> libros) {
        libros.sort(new Comparator<Libro>() {
            @Override
            public int compare(Libro l1, Libro l2) {
                return Integer.compare(l1.getPaginas(), l2.getPaginas());
            }
        });
        System.out.println("\n LIBROS ORDENADOS POR NÚMERO DE PÁGINAS:");
        mostrarLibros(libros);
    }

    /**
     * Ordena los libros por título en orden alfabético.
     *
     * @param libros lista de libros
     */
    public void ordenarPorTitulo(ArrayList<Libro> libros) {
        libros.sort((titulo1, titulo2) -> titulo1.getTitulo().compareTo(titulo2.getTitulo()));
        System.out.println("\n LIBROS ORDENADOS POR TÍTULO:");
        mostrarLibros(libros);
    }

    /**
     * Ordena los libros por autor en orden descendente.
     *
     * @param libros lista de libros
     */
    public void ordenarPorAutorDescendente (ArrayList<Libro> libros) {
        libros.sort(Comparator.comparing(Libro::getAutor).reversed());
        System.out.println("\n LIBROS ORDENADOS POR AUTOR (DESCENDENTE):");
        mostrarLibros(libros);
    }
}
