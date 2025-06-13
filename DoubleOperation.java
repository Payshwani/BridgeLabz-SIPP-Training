package JAVA;

import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        // Step 1: Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Step 2: Declare variables
        double a, b, c;

        // Step 3: Take input for a, b, and c
        System.out.print("Enter value for a: ");
        a = input.nextDouble();

        System.out.print("Enter value for b: ");
        b = input.nextDouble();

        System.out.print("Enter value for c: ");
        c = input.nextDouble();

        // Step 4: Perform operations using operator precedence
        double result1 = a + b * c;       // Multiplication before addition
        double result2 = a * b + c;       // Multiplication before addition
        double result3 = c + a / b;       // Division before addition
        double result4 = a % b + c;       // Modulus before addition

        // Step 5: Print the results
        System.out.printf("The results of Double Operations are:\n");
        System.out.printf("a + b * c = %.2f\n", result1);
        System.out.printf("a * b + c = %.2f\n", result2);
        System.out.printf("c + a / b = %.2f\n", result3);
        System.out.printf("a %% b + c = %.2f\n", result4); // %% to escape % in printf

        input.close();
    }
}
