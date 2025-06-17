package JAVA2;


import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number from user
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Loop through each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;       // Get last digit
            sum += digit * digit * digit;          // Add cube of digit to sum
            originalNumber = originalNumber / 10;  // Remove last digit
        }

        // Step 4: Check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
