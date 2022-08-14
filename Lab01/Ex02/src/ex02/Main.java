package ex02;

import java.util.Scanner;

/**
 *
 * @author @zejsneto
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter a number: ");
        num2 = input.nextInt();
        System.out.print("Enter a number: ");
        num3 = input.nextInt();
        System.out.print("Enter a number: ");
        num4 = input.nextInt();
        System.out.print("Enter a number: ");
        num5 = input.nextInt();
        for (int j = 1; j <= num1; j++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int j = 1; j <= num2; j++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int j = 1; j <= num3; j++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int j = 1; j <= num4; j++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int j = 1; j <= num5; j++) {
            System.out.print("*");
        }
        System.out.println("");

    }
}
