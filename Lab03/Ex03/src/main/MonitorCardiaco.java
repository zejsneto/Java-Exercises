
package main;

import java.util.Date;

/**
 *
 * @author jose neto
 */
public class MonitorCardiaco {
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;

    MonitorCardiaco(String jose, String neto, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public MonitorCardiaco(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int calcIdade() {
        return 2022-ano; 
    }
    
    public int calcFreqMax() {
        return 220 - calcIdade();
    }
    
    public double calcFreqAlvoIntervalo1() {
        return calcFreqMax()*0.5; //Freq Max * 50%
    }
    
    public double calcFreqAlvoIntervalo2() {
        return calcFreqMax()*0.85; //Freq Max * 85%
    }
}
