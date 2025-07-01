package JAVA2;


import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; // Store original for final check
        int sum = 0;

        // Step 2: Calculate sum of digits
        while (number != 0) {
            int digit = number % 10; // Get last digit
            sum += digit;            // Add to sum
            number = number / 10;    // Remove last digit
        }

        // Step 3: Check Harshad condition
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
