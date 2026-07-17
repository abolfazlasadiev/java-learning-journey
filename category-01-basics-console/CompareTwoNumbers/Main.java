import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your number: ");
        int num2 = input.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + "is Larger");
        } else if(num1 > num2) {
            System.out.println(num2 + "Smaller");
        } else if(num1 == num2) {
            System.out.println("Two numbers are equal.");
        }
    }
}
