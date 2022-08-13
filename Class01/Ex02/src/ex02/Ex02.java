package ex02;

import java.util.Scanner;

/**
 *
 * @author @zejsneto
 */
public class Ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();
        /**
         * 1 2 3
         * 1 3 2
         * 2 1 3
         * 2 3 1
         * 3 2 1
         * 3 1 2
         */
        if (number1 > number2 && number1 > number3 && number2 > number3) {
            System.out.printf("Crescent Order: %d %d %d\n", number3, number2, number1);//123
        } else if (number1 > number3 && number1 > number2 && number3 > number2) {
            System.out.printf("Crescent Order: %d %d %d\n", number2, number3, number1);//132
        } else if (number2 > number1 && number2 > number3 && number1 > number3) {
            System.out.printf("Crescent Order: %d %d %d\n", number3, number1, number2);//213
        } else if (number2 > number3 && number2 > number1 && number3 > number1) {
            System.out.printf("Crescent Order: %d %d %d\n", number1, number3, number2);//231
        } else if (number3 > number2 && number3 > number1 && number2 > number1) {
            System.out.printf("Crescent Order: %d %d %d\n", number1, number2, number3);//321
        } else if (number3 > number1 && number3 > number2 && number1 > number2) {
            System.out.printf("Crescent Order: %d %d %d\n", number2, number1, number3);//312
        } else if (number1 == number2 || number1 == number3 || number2 == number3) {
            System.out.printf("Crescent Order: %d %d %d\n", number1, number2, number3);//1=2=3
        } else if (number1 == number2 && number3 > number2) {
            System.out.printf("Crescent Order: %d %d %d\n", number1, number2, number3);//1=2 3>
        } else if (number1 == number2 && number2 > number3) {
            System.out.printf("Crescent Order: %d %d %d\n", number1, number2, number3);//1=2 3<
        } else if (number1 == number3 && number2 > number1) {
            System.out.printf("Crescent Order: %d %d %d\n", number1, number2, number3);//1=3 2>
        } else if (number1 == number3 && number3 > number2) {
            System.out.printf("Crescent Order: %d %d %d\n", number1, number2, number3);//1=3 2<
        } else if (number3 == number2 && number1 > number2) {
            System.out.printf("Crescent Order: %d %d %d\n", number1, number2, number3);//3=2 1>
        } else if (number3 == number2 && number3 > number1) {
            System.out.printf("Crescent Order: %d %d %d\n", number1, number2, number3);//3=2 1<
        } else {
            System.out.printf("ERROR! Try again.\n");//in case of error
        }

    }

}
