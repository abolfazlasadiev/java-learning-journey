import java.util.Scanner;

/**
 * The {@code Greeting} class represents a simple console-based program
 * that prompts the user for their name and displays a welcome message.
 *
 * @author Abolfazlasadi
 * @version 1.0
 * @since 2026-04-30
 */
public class Greeting {

    /**
     * The entry point of the /.application.
     * It creates a {@link Scanner} object to read user input from the console,
     * asks the user to enter their name, reads the entered name,
     * and then prints a greeting message to the console.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = input.nextLine();

        System.out.println("Hello " + name + " wellcom");

        input.close();
    }
}