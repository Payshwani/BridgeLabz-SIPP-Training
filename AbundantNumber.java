package JAVA2;


import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number
        System.out.print("Enter a number to check if it is an Abundant Number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum of divisors
        int sum = 0;

        // Step 3: Loop to find and sum all proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Step 4: Check if number is abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        sc.close();
    }
}
