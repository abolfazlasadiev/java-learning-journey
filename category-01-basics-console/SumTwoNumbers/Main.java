import java.util.Scanner;

/**
 * A simple program that reads two integers from the user,
 * calculates their sum, and prints the result.
 *
 * @author Abolfazl Asadi
 * @version 1.0
 * @since 2026-04-30
 * @see java.util.Scanner
 */
public class SumTwoNumbers {

    /**
     * The main method – entry point of the application.
     * Prompts the user for two numbers, computes their sum, and displays it.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user and read the first integer
        System.out.print("Enter yor number: ");
        int num1 = input.nextInt();

        // Prompt the user and read the second integer
        System.out.print("Enter your number next: ");
        int num2 = input.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("Sum Two Numbers:  " + sum);
    }
}