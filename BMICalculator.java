package JAVA2;


import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Input weight in kg and height in cm
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Step b: Calculate BMI using formula
        double bmi = weight / (heightMeters * heightMeters);

        // Step c: Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Output the result
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}
