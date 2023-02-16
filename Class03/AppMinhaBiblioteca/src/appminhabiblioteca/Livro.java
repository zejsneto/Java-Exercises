/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appminhabiblioteca;

/**
 *
 * @author osjunior
 */
public class Livro {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(String titulo, String autor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
    }
}
