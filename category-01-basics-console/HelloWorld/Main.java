/**
 * The HelloWorld class is a simple program that prints "Hello, World!" to the console.
 * <p>
 * This program serves as a basic example for learning Java structure:
 * a public class, the main method, and console output.
 * </p>
 *
 * @author (Your Name)
 * @version 1.0
 * @since 2025-04-28
 * @see System#out
 * @see System#out#println(String)
 */
public class HelloWorld {

    /**
     * The entry point of the application. This method is called by the Java Virtual Machine (JVM)
     * when the program starts.
     * <p>
     * In this simple implementation, it prints a single line of text to the standard output
     * and then terminates. No command-line arguments are processed.
     * </p>
     *
     * @param args command-line arguments (not used in this program, but kept to follow JVM conventions)
     */
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");
    }
}