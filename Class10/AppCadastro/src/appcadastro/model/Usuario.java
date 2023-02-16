package appcadastro.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Usuario {

    private String nome;
    private String sobrenome;
    private String email;
    private int idade;

    public Usuario() {
        
    }

    public Usuario(String nome, String sobrenome, String email, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean cadastra() {
        //Aqui faz o arquivo
        boolean aux = false;
        try {
            FileWriter arquivo = new FileWriter("usuarios.txt", true);
            PrintWriter escritaArquivo = new PrintWriter(arquivo);

            escritaArquivo.println("Nome: " + this.getNome() + " │ Sobrenome: " + this.getSobrenome() + " │ Email: " + this.getEmail() + " │ Idade: " + this.getIdade());

            arquivo.close();
            aux = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            aux = false;
        }
        return aux;
    }

    public void leArquivo() {
        try {
            FileReader arquivo = new FileReader("usuarios.txt");
            BufferedReader br = new BufferedReader(arquivo);

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
