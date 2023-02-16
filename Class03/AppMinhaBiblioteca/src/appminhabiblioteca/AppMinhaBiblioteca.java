/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appminhabiblioteca;

/**
 *
 * @author osjunior
 */
public class AppMinhaBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro[] livros = new Livro[3];
        livros[0] = new Livro("Técnicas de Invasão", "Bruno Fraga");
        livros[1] = new Livro("Percy Jackson", "Rick Riordan");
        livros[2] = new Livro("Jesus Copy", "Douglas Gonçalves");

        Biblioteca b = new Biblioteca(livros);

        for (Livro l : b.getLivros()) {
            System.out.print("Título: " + l.getTitulo());
            System.out.print(" | ");
            System.out.print("Autor: " + l.getAutor());
            System.out.println();
        }
    }

}
