package ex01;

/**
 *
 * @author ZENETO
 */

//Classe Retangulo
public class Retangulo {
    //Lado1 e Lado2 como private int
    private int lado1;
    private int lado2;
    
    //Get e Set para os atributos
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    //Area() que retorna a area do triangulo
    public int area(){
        return this.getLado1() * this.getLado2();
    }
    
    //Perimetro() que retorna o perimetro do retangulo
    public int perimetro() {
        return (2* this.getLado1()) + (2* this.getLado2());
    }
}  
   

        