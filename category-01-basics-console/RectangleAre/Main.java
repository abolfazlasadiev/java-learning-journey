import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Length: ");
        int Length = input.nextInt();
        System.out.print("Enter Width: ");
        int Width = input.nextInt();

        int Area = Length * Width;
        System.out.println("Your rectangle is equal to: " + Area);
    }
}
