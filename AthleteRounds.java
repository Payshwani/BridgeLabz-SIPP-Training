package JAVA;


import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter side 1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = input.nextDouble();

        // Perimeter
        double perimeter = side1 + side2 + side3;

        // Required distance in meters: 5 km = 5000 meters
        int rounds = (int) Math.ceil(5000 / perimeter);

        // Output
        System.out.printf("The total number of rounds the athlete will run is %d to complete 5 km\n", rounds);

        input.close();
    }
}
