package RectangleAre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter your length: ");
            double length = input.nextDouble();

            System.out.print("Enter your width; ");
            double width = input.nextDouble();

            RectangleArea rectangle = new RectangleArea(length, width);

            System.out.println("The area of the rectangle is equal to; " + rectangle.calculateArea());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
