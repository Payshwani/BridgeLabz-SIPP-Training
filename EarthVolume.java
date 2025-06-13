package JAVA;

public class EarthVolume {
    public static void main(String[] args) {
        // Step 1: Radius of the Earth in km
        double radiusKm = 6378.0;

        // Step 2: Volume formula for a sphere: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Step 3: Convert km^3 to miles^3 (1 mile = 1.6 km → 1 km = 1/1.6 miles)
        // So, 1 km^3 = (1/1.6)^3 = approx 0.244140625 miles^3
        double conversionFactor = Math.pow(1 / 1.6, 3);
        double volumeMiles3 = volumeKm3 * conversionFactor;

        // Step 4: Display output
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f\n", volumeKm3, volumeMiles3);
    }
}
