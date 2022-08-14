package ex05;

import java.util.Scanner;

/**
 *
 * @author @zejsneto
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p;
        int r;

        System.out.print("Enter 'P' value (0 or 1): ");
        p = input.nextInt();
        System.out.print("Enter 'R' value (0 or 1): ");
        r = input.nextInt();

        if (p < 0 || p > 1 || r < 0 || r > 1) {
            System.out.println("Enter a valid value");
        }
        else if (p == 0){
            System.out.println("The ball will follow to 'C' path.");
        }
        else if (p==1 && r==0){
            System.out.println("The ball will follow to 'B' path");
        }
        else if (p==1 && r==1){
            System.out.println("The ball will follow to 'A' path");
        }
    }

}
