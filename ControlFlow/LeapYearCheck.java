package JAVA2;


import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input year
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        System.out.println("\n--- Part 1: Using Multiple If-Else Statements ---");
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later.");
        }

        System.out.println("\n--- Part 2: Using One If Statement with Logical Operators ---");
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year.");
        } else {
            System.out.println("Year must be 1582 or later.");
        }

        sc.close();
    }
}
