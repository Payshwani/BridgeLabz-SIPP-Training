package JAVA;

import java.util.Scanner;

public class SquareSideFinder {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Step 2: Take perimeter input from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Step 3: Calculate the side (Perimeter = 4 × side)
        double side = perimeter / 4;

        // Step 4: Display output
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

        input.close();
    }
}
