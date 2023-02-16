
package exbiblioteca;

/**
 *
 * @author ZENETO
 */
public class Livro {
    private String titulo;
    private String autor;
    private Biblioteca library;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public Livro() {
        this.library = new Biblioteca();
    }
    
    public Biblioteca getLibrary() {
        return this.library;
    }
    
    public Livro(String titulo, String autor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
    }
    
}
