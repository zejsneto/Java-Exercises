package ex04;

import java.util.Scanner;
/**
 *
 * @author ZENETO
 */
public class Ex04 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 1;
        double number;
        int quantity = 0;
        while (contador <=20){
            System.out.printf("Enter %d number: ",contador);
            number = input.nextDouble();
            if (number>0){
                quantity = quantity + 1;        
            }
            contador = contador + 1;
        }
        System.out.printf("The quantity of positive numbers is: %d\n",quantity);
    }
    
}
