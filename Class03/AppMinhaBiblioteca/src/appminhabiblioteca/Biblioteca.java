/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appminhabiblioteca;

/**
 *
 * @author osjunior
 */
public class Biblioteca {

    private Livro[] livros;

    public Livro[] getLivros() {
        return this.livros;
    }

    public Biblioteca(Livro[] livros) {
        this.livros = livros;
    }
}
