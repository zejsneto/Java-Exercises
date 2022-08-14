package ex03;

import java.util.Scanner;

/**
 *
 * @author @zejsneto
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double adjustment;
        double newSalary;
        double IncValue;
        double printAdjustment;
        double salary;
        System.out.print("Enter salary (two decimal places. ex: 1500,50): ");
        salary = input.nextDouble();

        if (salary <= 0.00) {
            System.out.println("Please enter a valid value.");
        } else if (salary > 0.00 && salary <= 400.00) {
            adjustment = 1.15;
            newSalary = salary * adjustment;
            IncValue = newSalary - salary;
            printAdjustment = adjustment * 100 - 100;
            System.out.printf("New salary: %.2f\n", newSalary);
            System.out.printf("Increased value: %.2f\n", IncValue);
            System.out.printf("Adjustment percentage: %.0f%% \n", printAdjustment);
        } else if (salary >= 400.01 && salary <= 800.00) {
            adjustment = 1.12;
            newSalary = salary * adjustment;
            IncValue = newSalary - salary;
            printAdjustment = adjustment * 100 - 100;
            System.out.printf("New salary: %.2f\n", newSalary);
            System.out.printf("Increased value: %.2f\n", IncValue);
            System.out.printf("Adjustment percentage: %.0f%% \n", printAdjustment);
        } else if (salary >= 800.01 && salary <= 1200.00) {
            adjustment = 1.10;
            newSalary = salary * adjustment;
            IncValue = newSalary - salary;
            printAdjustment = adjustment * 100 - 100;
            System.out.printf("New salary: %.2f\n", newSalary);
            System.out.printf("Increased value: %.2f\n", IncValue);
            System.out.printf("Adjustment percentage: %.0f%% \n", printAdjustment);
        } else if (salary >= 1200.01 && salary <= 2000.00) {
            adjustment = 1.07;
            newSalary = salary * adjustment;
            IncValue = newSalary - salary;
            printAdjustment = adjustment * 100 - 100;
            System.out.printf("New salary: %.2f\n", newSalary);
            System.out.printf("Increased value: %.2f\n", IncValue);
            System.out.printf("Adjustment percentage: %.0f%% \n", printAdjustment);
        } else if (salary >= 2000.01) {
            adjustment = 1.04;
            newSalary = salary * adjustment;
            IncValue = newSalary - salary;
            printAdjustment = adjustment * 100 - 100;
            System.out.printf("New salary: %.2f\n", newSalary);
            System.out.printf("Increased value: %.2f\n", IncValue);
            System.out.printf("Adjustment percentage: %.0f%% \n", printAdjustment);
        }
    }
}
