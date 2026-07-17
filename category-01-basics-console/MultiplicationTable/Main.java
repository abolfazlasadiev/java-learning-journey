import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        int i = 1;
        for (i=1; i<=number; i++ ){
             int zarb = number * i;

            System.out.println(number + "*" + i +"=" + zarb);
        }
    }
}
