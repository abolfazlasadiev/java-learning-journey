import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number1 = input.nextInt();
        System.out.print("Enter your number: ");
        int number2 = input.nextInt();
        System.out.print("Enter your number: ");
        int number3 = input.nextInt();

        int Average = (number1 + number2 + number3) / 3;
        System.out.println("The average is " + Average);
    }
}
