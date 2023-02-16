/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appformas;

public class Retangulo extends Forma{
    public double comprimento;
    public double largura;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
       
    @Override
    public double perimetro(){
        return (comprimento * 2) + (largura * 2);
    }
    
    @Override
    public void print(){
        System.out.println("Retangulo...");
        System.out.println(this.perimetro());
    }
}
