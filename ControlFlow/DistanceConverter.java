package JAVA;


import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Step 2: Take input distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Step 3: Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        // Step 4: Display the result
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f\n",
                          distanceInYards, distanceInMiles);

        input.close();
    }
}
