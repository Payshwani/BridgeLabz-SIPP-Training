package JAVA2;
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Special case for 0
        if (number == 0) {
            System.out.println("Number of digits: 1");
            return;
        }

        // Step 2: Initialize count variable
        int count = 0;

        // Step 3: Make number positive if it's negative
        number = Math.abs(number);

        // Step 4: Loop to count digits
        while (number != 0) {
            number = number / 10; // Remove last digit
            count++;              // Increase count
        }

        // Step 5: Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
