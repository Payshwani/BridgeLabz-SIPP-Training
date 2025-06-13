package JAVA;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Step 2: Take input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Step 3: Convert pounds to kilograms
        double weightInKg = weightInPounds / 2.2;

        // Step 4: Display result
        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f\n",
                          weightInPounds, weightInKg);

        input.close();
    }
}
