package JAVA;
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Step 1: Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Step 2: Declare variables
        int a, b, c;

        // Step 3: Take user input
        System.out.print("Enter value for a: ");
        a = input.nextInt();

        System.out.print("Enter value for b: ");
        b = input.nextInt();

        System.out.print("Enter value for c: ");
        c = input.nextInt();

        // Step 4: Perform operations
        int result1 = a + b * c;       // Multiplication before addition
        int result2 = a * b + c;       // Multiplication before addition
        int result3 = c + a / b;       // Division before addition
        int result4 = a % b + c;       // Modulus before addition

        // Step 5: Print results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        input.close();
    }
}
