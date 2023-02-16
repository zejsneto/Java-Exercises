
package exlab;

import static java.lang.Math.sqrt;

/**
 *
 * @author ZENETO
 */
public class Complex {
    private float parteReal;
    private float parteImaginaria;
    
    //i = sqrt(-1);
    /*
    Número complexos
    parteReal + parteImaginaria * i
    
    i = sqrt(-1)
    */

    public float getParteReal() {
        return parteReal;
    }

    public void setParteReal(float parteReal) {
        this.parteReal = parteReal;
    }

    public float getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(float parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    
    //Construtor que permita que um objeto dessa classe seja inicializado
    public Complex(float parteReal, float parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    
    //Construtor sem argumento com valores padrão
    public Complex() {
        this.parteReal = 1;
        this.parteImaginaria = 1;
    }
    
    public void add(Complex n2) {
        float somaParteReal;
        float somaParteImaginaria;
        Complex answer = new Complex();
        
        somaParteReal = this.getParteReal() + n2.getParteReal();
        somaParteImaginaria = this.getParteImaginaria() + n2.getParteImaginaria();
        
        answer.setParteReal(somaParteReal);
        answer.setParteImaginaria(somaParteImaginaria);
        
        if (somaParteImaginaria >= 0) {
            System.out.println("A soma é: " + answer.getParteReal() + " + " + answer.getParteImaginaria() + " * i.");
        }else {
            System.out.println("A soma é: " + answer.getParteReal() + " " + answer.getParteImaginaria() + " * i.");
        }
    }
    
    public void sub(Complex n2) {
        float subParteReal;
        float subParteImaginaria;
        Complex answer = new Complex();
        
        subParteReal = this.getParteReal() - n2.getParteReal();
        subParteImaginaria = this.getParteImaginaria() - n2.getParteImaginaria();
        
        answer.setParteReal(subParteReal);
        answer.setParteImaginaria(subParteImaginaria);
        
        if (subParteImaginaria >= 0) {
            System.out.println("A soma é: " + answer.getParteReal() + " + " + answer.getParteImaginaria() + " * i.");
        }else {
            System.out.println("A soma é: " + answer.getParteReal() + " " + answer.getParteImaginaria() + " * i.");
        }
    }
    
    public void imprime() {
        if (parteImaginaria >=0) {
        System.out.println("O número complexo é: " + this.parteReal + " + " + this.parteImaginaria + " * i.");
        } else {
            //imprrimir certo - -> * -1 num negativo
            System.out.println("O número complexo é: " + this.parteReal + " " + this.parteImaginaria + " * i.");
        }
    }
}
