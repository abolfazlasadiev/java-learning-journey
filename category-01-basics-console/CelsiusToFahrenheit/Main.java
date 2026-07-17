import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature in Celsius : ");
        Double Celsius = input.nextDouble();
        Double Fahrenheit = (Celsius * 1.8) + 32;
        System.out.print("Fahrenheit : " + Fahrenheit);

    }
}
