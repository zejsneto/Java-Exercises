package ex04;

import java.util.Scanner;

/**
 *
 * @author @zejsneto
 * 
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        double value;
        int quantity;
        double totalValue = 0;
        
        for (int aux = 0 ; aux <5;aux++){
            System.out.print("Enter product number (1 to 5): ");
            num = input.nextInt();
            switch (num){
                case 1:
                    System.out.print("Enter quantity sold: ");
                    quantity = input.nextInt();
                    value = 2.98;
                    totalValue = value * quantity;
                    break;
                case 2:
                    System.out.print("Enter quantity sold: ");
                    quantity = input.nextInt();
                    value = 4.50;
                    totalValue = totalValue + (value * quantity);
                    break;
                case 3:
                    System.out.print("Enter quantity sold: ");
                    quantity = input.nextInt();
                    value = 3.98;
                    totalValue = totalValue + (value * quantity);
                    break;
                case 4:
                    System.out.print("Enter quantity sold: ");
                    quantity = input.nextInt();
                    value = 4.49;
                    totalValue = totalValue + (value * quantity);
                    break;
                case 5:
                    System.out.print("Enter quantity sold: ");
                    quantity = input.nextInt();
                    value = 6.87;
                    totalValue = totalValue + (value * quantity);
                    break;    
            }
        }
        System.out.printf("The total value of products sold is:   %.2f\n" ,totalValue); 
    }   
}
