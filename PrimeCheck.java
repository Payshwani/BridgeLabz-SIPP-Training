package JAVA2;


import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Prime check only for numbers greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Not a prime number
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
