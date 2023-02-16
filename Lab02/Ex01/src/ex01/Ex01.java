
package ex01;

import java.util.Scanner;

/**
 *
 * @author ZENETO
 */
public class Ex01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Crie dois objetos (ret1 e ret2) do tipo Retângulo
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        //Obtenha pelo teclado o valor de lado1 e lado2 para ret1 e ret2
        System.out.print("Lado 1 do Ret 1: ");
        //Inicialize os atributos de ret1 e ret2 com os métodos set
        ret1.setLado1(input.nextInt());
        
        System.out.print("Lado 2 do Ret 1: ");
        ret1.setLado2(input.nextInt());
        
        System.out.print("Lado 1 do Ret 2: ");
        ret2.setLado1(input.nextInt());
        
        System.out.print("Lado 2 do Ret 2: ");
        ret2.setLado2(input.nextInt());
        
        //Exiba o conteúdo dos atributos de ret1 e ret2 utilizando os gets
        System.out.println("Lado 1 do Ret 1 é: " + ret1.getLado1());
        System.out.println("Lado 2 do Ret 1 é: " + ret1.getLado2());
        System.out.println("Lado 1 do Ret 2 é: " + ret2.getLado1());
        System.out.println("Lado 2 do Ret 2 é: " + ret2.getLado2());
        
        //Exiba o perímetro e a área dis objetos ret1 e ret2 por meio dos métodos criados
        System.out.println("A área do Ret 1 é: " + ret1.area());
        System.out.println("O perímetro do Ret 1 é: " + ret1.perimetro());
        System.out.println("A área do Ret 2 é: " + ret2.area());
        System.out.println("O perímetro do Ret 2 é: " + ret2.perimetro());

    }
    
}
