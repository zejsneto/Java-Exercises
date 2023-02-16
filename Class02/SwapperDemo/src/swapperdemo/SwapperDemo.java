package swapperdemo;

import java.util.Scanner;
/**
 *
 * @author @zejsneto
 */
public class SwapperDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Swapp troca = new Swapp();
        
        System.out.print("X = ");
        troca.setX(input.nextFloat());
        System.out.print("Y = ");
        troca.setY(input.nextFloat());
        
        troca.swap();
        
        System.out.println("Novo X = " + troca.getX());
        System.out.println("Novo Y = " + troca.getY());
    }
    
}
