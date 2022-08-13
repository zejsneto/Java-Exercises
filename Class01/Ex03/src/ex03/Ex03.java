package ex03;

import java.util.Scanner;

/**
 *
 * @author @zejsneto
 */
public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int contador =  1; contador <=100; contador++){
            if(contador%2!=0){
                System.out.println(contador);
            }
        }
    }
}
