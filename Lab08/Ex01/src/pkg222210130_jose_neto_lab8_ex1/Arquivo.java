package pkg222210130_jose_neto_lab8_ex1;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.HashMap;

/**
 * Classe Arquivo. Processa informações de Registro para um arquivo de texto.
 * @author ZENETO
 */
public class Arquivo {

    private String nomeArquivo;
    private ArrayList<Registro> registros;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.registros = new ArrayList<>();
    }

    public void salvaRegistro(Registro r) throws IOException {
        FileWriter arquivo = new FileWriter(this.nomeArquivo, true);
        PrintWriter escreve = new PrintWriter(arquivo);
        escreve.println(r);
        arquivo.close();
    }

    public ArrayList<Registro> leRegistros() throws IOException {
        FileReader arquivo = new FileReader(this.nomeArquivo);
        BufferedReader br = new BufferedReader(arquivo);

        String linha;
        while ((linha = br.readLine()) != null) {
            Registro reg = leRegistro(linha);
            this.registros.add(reg);
        }
        arquivo.close();
        return this.registros;
    }

    private Registro leRegistro(String linha) {
        String[] dados = linha.split("\\|");
        Registro reg = new Registro();
        reg.setNome(dados[0]);
        reg.setSobrenome(dados[1]);
        reg.setOperacao(OperacaoBancaria.valueOf(dados[2]));
        reg.setValor(Double.valueOf(dados[3].replace("R$", "").replace(".", "").replace(",", ".")));
        return reg;
    }
    
    private HashMap<String, String> config;

    private static Arquivo instancia;

    public static Arquivo getInstancia() {
        if (instancia == null) {
            instancia = new Arquivo();
        }
        return instancia;
    }

    // Construtor privado
    private Arquivo() {
        config = new HashMap<String, String>() {
            {
                put("Salva", "salvaRegistro");
                put("Le", "leRegistro");
            }
        };
    }

    public String getValor(String chave) {
        return this.config.get(chave);
    }
    
}
