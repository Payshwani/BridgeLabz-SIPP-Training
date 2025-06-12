package JAVA;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Step 1: Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();

        // Step 2: Convert cm to inches
        double totalInches = heightCm / 2.54;

        // Step 3: Convert inches to feet and remaining inches
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        // Step 4: Print the result
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightCm, feet, inches);

        scanner.close();
    }
}
