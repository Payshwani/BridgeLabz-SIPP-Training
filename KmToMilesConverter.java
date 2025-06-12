package JAVA;


public class KmToMilesConverter {
    public static void main(String[] args) {
        // Step 1: Initialize distance in kilometers
        double kilometers = 10.8;

        // Step 2: Convert to miles (1 mile = 1.6 km)
        double miles = kilometers / 1.6;

        // Step 3: Print the result
        System.out.printf("The distance %.2f km in miles is %.2f\n", kilometers, miles);
    }
}
