package JAVA;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Step 1: Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Step 2: Declare variables and take input
        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();

        // Step 3: Calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Step 4: Convert area to square inches
        // 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) = 6.4516 sq cm
        double areaSqIn = areaSqCm / 6.4516;

        // Step 5: Display output
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaSqIn, areaSqCm);

        input.close();
    }
}
