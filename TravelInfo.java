package JAVA;


import java.util.Scanner;

public class TravelInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = input.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();

        System.out.print("Enter To City: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from From City to Via City (miles): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from Via City to Final City (miles): ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time taken from From City to Via City (minutes): ");
        double timeFromToVia = input.nextDouble();

        System.out.print("Enter time taken from Via City to Final City (minutes): ");
        double timeViaToFinalCity = input.nextDouble();

        // Calculations
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.609; // Convert miles to km
        double totalTime = timeFromToVia + timeViaToFinalCity;

        // Output
        System.out.printf("The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.2f minutes\n",
                          name, fromCity, toCity, viaCity, totalDistanceKm, totalTime);

        input.close();
    }
}
