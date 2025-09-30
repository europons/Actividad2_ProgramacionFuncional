package Ejercicio3;

/**
 * La clase {@code Libro} representa un libro genérico con título, autor y número de páginas.
 * <p>
 * Proporciona métodos para acceder y modificar sus atributos, así como un método
 * {@code toString()} para obtener una representación en texto del objeto.
 * </p>
 */
public class Libro {
    String titulo;
    String autor;
    int paginas;

    /**
     * Construye un nuevo objeto {@code Libro} con los valores especificados.
     *
     * @param titulo  el título del libro
     * @param autor   el autor del libro
     * @param paginas el número total de páginas
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /** Getters y Setters */
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public int getPaginas() {return paginas;}

    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setAutor(String autor) {this.autor = autor;}
    public void setPaginas(int paginas) {this.paginas = paginas;}

    /**
     * Devuelve una representación en cadena del libro con formato:
     * {@code Título -> <titulo>; Autor -> <autor>; Páginas -> <paginas>}
     *
     * @return representación en texto del libro
     */
    @Override
    public String toString() {
        return "Título -> " + titulo + "; Autor -> " + autor + "; Páginas -> " + paginas;
    }
}
