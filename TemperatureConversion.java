package JAVA;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Step 2: Take input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Step 3: Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Step 4: Display the result
        System.out.printf("The %.2f Celsius is %.2f Fahrenheit\n", celsius, fahrenheit);

        input.close();
    }
}
