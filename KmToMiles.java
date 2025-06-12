package JAVA;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Step 2: Declare km as double
        double km;

        // Step 3: Take user input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Step 4: Convert km to miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Step 5: Display output
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);

        input.close();
    }
}
