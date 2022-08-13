package ex01;

import java.util.Scanner;

/**
 *
 * @author @zejsneto
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1;
        double number2;
        double number3;
        double product;

        System.out.print("Enter a: ");
        number1 = input.nextDouble();

        System.out.print("Enter b: ");
        number2 = input.nextDouble();

        System.out.print("Enter c: ");
        number3 = input.nextDouble();

        product = number1 * number2 * number3;

        System.out.printf("a * b * c = %f\n", product);
    }

}
